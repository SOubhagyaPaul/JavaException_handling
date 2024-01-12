package exceptionCodes;

import java.util.Scanner;

/*
 * Define an exception called "NoMatchFoundException" that is thrown when a string is
not equal to "University". Write a program that uses this exception. 
 */
class NoMatchFoundException extends Exception{
	NoMatchFoundException(String e){
		super(e);
	}
}
public class Prblm2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the string : ");
		String s=sc.nextLine();
		try{
			if(s.equals("University")){
				System.out.println("Matched.");
			}
			else
				throw new NoMatchFoundException("The string is not equal to university.");		//NoMatchFoundException" that is thrown when a string is
																								//not equal to "University"
			
		}
		catch(NoMatchFoundException e){
			System.out.println(e.getMessage());
		}
		finally{
			System.out.println("Program end.");
		}
	}

}

/*
 * output:
 * 
 * Enter the string : 
University
Matched.
Program end.
--------------------------
Enter the string : 
soubhagya
The string is not equal to university.
Program end.


 */
