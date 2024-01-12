package exceptionCodes;

/*
 * Write a program that outputs the name of the capital of the country entered at the
command line. The program should throw a “NoMatchFoundException” when it fails to
print the capital of the country entered at the command line.
 */
/*
class MyNoMatchFoundException extends Exception{
	MyNoMatchFoundException(String e){
		super(e);
	}
}*/
public class Prblm5 {
	static void check(String s) throws NoMatchFoundException{
		switch(s.toUpperCase()) {		// outputs the name of the capital of the country entered at the
												//command line.
		case "INDIA": System.out.println("The captial of INDIA is delhi");
					break;
		case "THAILAND": System.out.println("The captial of THAILAND is BANGKOK");
					break;
		case "JAPAN": System.out.println("The captial of JAPAN is TOKYO");
					break;
		case "CHINA": System.out.println("The captial of CHINA is BEIJING");
					break;
		case "QATAR": System.out.println("The captial of QATAR is DOHA");
					break;
		default:										//The program should throw a “NoMatchFoundException” when it fails to
														//print the capital of the country entered at the command line.
			throw new NoMatchFoundException("The country name you have entered is not found");
					
		}
	}
	public static void main(String[] args) {
		 if (args.length == 0) {
	            System.out.println("Please enter a country as a command line argument.");
	            return;
	        }
		 String s = args[0];
		try {
			check(s);
		}
		catch(NoMatchFoundException e) {
			System.out.println(e.getMessage());
		}
	}
}

/*
 * output:
 * if in command line india is given : The captial of INDIA is delhi
 * if we enter a country name which is not in the switch case options then-> 
 * 		output: The country name you have entered is not found
 * 
 */
