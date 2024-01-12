package exceptionCodes;

import java.util.Scanner;

/*
 * Write a program called Factorial.java that computes factorials and catches the result in an
array of type long for reuse. The long type of variable has its own range. For example 20!
Is as high as the range of long type. So check the argument passes and "throw an
exception", if it is too big or too small. If x is less than 0 throw an IllegalArgument
Exception with a message "Value of x must be positive".If x is above the length of the
array throw an IllegalArgumentException with a message "Result will overflow".
Here x is the value for which we want to find the factorial.
 */
class Factorial{
	int size;
	Factorial(int size){
		this.size=size;
	}
	int fact(int n)throws IllegalArgumentException{		//func to find factorial 
		
		if (n >= this.size)   
            throw new IllegalArgumentException("Overflow; x is too large.");	//If x is above the length of the
																				//array throw an IllegalArgumentException with a message "Result will overflow"
        if (n<0) 
        	throw new IllegalArgumentException("Value of x must be positive");	//If x is less than 0 throw an IllegalArgument
        																			//Exception
		
        if (n == 0) return 1; 
        
        else return n * fact(n-1);
	}
	
}
public class Prblm1 {

	public static void main(String[] args) {
		long arr1[];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range : ");
		int size=sc.nextInt();
		arr1= new long[size];
		try{
			
			Factorial f=new Factorial(size);
			for(int i=0;i<size;i++){
				System.out.println("Enter the number for calculate factorial : ");
				int n=sc.nextInt();
				arr1[i]=f.fact(n);
			}
		}
		catch( IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
		finally {
			for(int i=0;i<size;i++){
				System.out.println("The array elements are: "+arr1[i]);
			}
		}
	}

}
/*
output:
Enter the range : 
5
Enter the number for calculate factorial : 
2
Enter the number for calculate factorial : 
4
Enter the number for calculate factorial : 
9
Overflow; x is too large.
The array elements are: 2
The array elements are: 24
The array elements are: 0
The array elements are: 0
The array elements are: 0
------------------------------------

Enter the range : 
9
Enter the number for calculate factorial : 
-10
Value of x must be positive
The array elements are: 0
The array elements are: 0
The array elements are: 0
The array elements are: 0
The array elements are: 0
The array elements are: 0
The array elements are: 0
The array elements are: 0
The array elements are: 0
--------------------------------



*/