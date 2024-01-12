package exceptionCodes;

import java.util.Scanner;

/*
 * Write a class that keeps a running total of all characters passed to it (one at a time) and
throws an exception if it is passed a non-alphabetic character. 
 */
class NonAlphabeticException extends Exception {
	String msg;

	NonAlphabeticException(String s) {
		super(s);
	}
}

public class Prblm4 {
	static int count=0;
	public static void countLetter(char c) throws NonAlphabeticException {
		if (Character.isAlphabetic(c))
			count++;		//keeps a running total of all characters passed to it
		else 
			throw new NonAlphabeticException(c + " is not a letter");	//throws an exception if it is passed a non-alphabetic character

	}
	public static void main(String[] args) {
		try{   
			countLetter('c');
			countLetter('d');
			countLetter('b');
			countLetter('1');
			countLetter('x');
		}
		catch(NonAlphabeticException e){
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("The total count of char is :"+count);
		}

	}

}

/*
 * output:
 * 1 is not a letter
The total count of char is :3

 */
