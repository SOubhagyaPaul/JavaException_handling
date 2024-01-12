package exceptionCodes;
/*
 * Write a program that takes a value at the command line for which factorial is to be
computed. The program must convert the string to its integer equivalent. There are three
possible user input errors that can prevent the program from executing normally.
The first error is when the user provides no argument while executing the program and an
ArrayIndexOutOfBoundsException is raised. You must write a catch block for this.
The second error is NumberFormatException that is raised in case the user provides a
non-integer (float double) value at the command line.The third error is IllegalArgument
Exception. This needs to be thrown manually if the value at the command line is 0.
 */
public class Prblm6 {
	static long fact(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }
	public static void main(String[] args) {
		long result;
		try {
			if (args.length == 0) {
	            System.out.println("Please enter a country as a command line argument.");	//the user provides no argument while executing the program and an
	            																			//ArrayIndexOutOfBoundsException is raised//
	            throw new ArrayIndexOutOfBoundsException("No command line inputu given.");	
	        }
			int n=Integer.parseInt(args[0]);	//The program must convert the string to its integer equivalent
			if (n == 0) {
                throw new IllegalArgumentException("Argument cannot be zero for factorial calculation.");	//IllegalArgument
                																							//Exception. This needs to be thrown manually if the value at the command line is 0.
            }
			else
				result =fact(n);
			System.out.println("The factorial of "+n+" is "+result);
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		catch (NumberFormatException e) {			//NumberFormatException that is raised in case the user provides a
													//non-integer (float double) value at the command line
			System.out.println("please enter a valid integer");
		}
		catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

	}

}

/*
 * 
 * output:
 * The factorial of 5 is 120
 * ----------------------------------
 * if we enter 5.4 in command line -> please enter a valid integer
-------------------------------------------------------------------
if we enter 0 in command line -> please enter a valid integer
-------------------------------------------------------------------
if not enter any value in command line -> 
Please enter a country as a command line argument.
No command line inputu given.


 * 
 * 
 */
