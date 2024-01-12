package exceptionCodes;

import java.util.Scanner;

/*
 * Write a program to create a class called MyStack that includes functions to perform all
operations on a stack as well as raises an exception whenever overflow/underflow error
occurs.
 */
class StackOverflowException extends Exception{
	StackOverflowException(String e){
		super(e);
	}
}
class StackUnderflowException extends Exception{
	StackUnderflowException(String e){
		super(e);
	}
}
class Stack1{
	int size;
	int top;
	int arr[];
	Stack1(int size)
	{
		top=-1;
		this.size=size;
		arr= new int[size];
	}
	boolean isFull(){
		
		return top==size-1;
	}
	boolean isEmpty(){
		
		return top==-1;
			
	}
	public void push(int n) throws StackOverflowException
	{
		if(isFull()){
			
			throw new StackOverflowException("The stack is in overflow condition");
		}
		else{
			arr[++top]=n;
		}
	}
	public int pop() throws StackUnderflowException
	{
		if(isEmpty()){
			throw new StackUnderflowException("The stack is in underflow condition");
		}
		else
			return arr[top--];
	}
	public void display1(){
		System.out.println("The stack view in LIFO manner: ");
		for(int i=this.top;i>=0;i--){
			System.out.print(arr[i]+"\t");
		}
	}
	
}
public class Prblm3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size= sc.nextInt();
		Stack1 s1=new Stack1(size);
		int x=0;
		try{
		while(true)
		{
			if(x==1)
				break;
			System.out.println("Enter 1 for push  into stack ");
			System.out.println("Enter 2 for  pop into stack   ");
			System.out.println("Enter 3 to display   ");
			System.out.println("Enter 4 to stop   ");
			
			int ch= sc.nextInt();
			switch(ch){
			case 1: {
					System.out.println("Enter the value for push ");
					int val=sc.nextInt();
					s1.push(val);
					break;
				}
			case 2: 
				s1.pop();
				break;
		
			case 3:{
				s1.display1();
				break;
			}
			case 4:
				x=1;
				break;

			}
		}
		}
		catch (StackOverflowException e){
			System.out.println(e.getMessage());
		}
		catch (StackUnderflowException e){
			System.out.println(e.getMessage());
		}
		finally {
			s1.display1();
		}
	}
}
/*
 * Enter the size of the array: 
5
Enter 1 for push  into stack 
Enter 2 for  pop into stack   
Enter 3 to display   
Enter 4 to stop   
1
Enter the value for push 
10
Enter 1 for push  into stack 
Enter 2 for  pop into stack   
Enter 3 to display   
Enter 4 to stop   
1
Enter the value for push 
20
Enter 1 for push  into stack 
Enter 2 for  pop into stack   
Enter 3 to display   
Enter 4 to stop   
1
Enter the value for push 
30
Enter 1 for push  into stack 
Enter 2 for  pop into stack   
Enter 3 to display   
Enter 4 to stop   
1
Enter the value for push 
40
Enter 1 for push  into stack 
Enter 2 for  pop into stack   
Enter 3 to display   
Enter 4 to stop   
1
Enter the value for push 
50
Enter 1 for push  into stack 
Enter 2 for  pop into stack   
Enter 3 to display   
Enter 4 to stop   
1
Enter the value for push 
60
The stack is in overflow condition
The stack view in LIFO manner: 
50	40	30	20	10
--------------------------------------------
Enter the size of the array: 
3
Enter 1 for push  into stack 
Enter 2 for  pop into stack   
Enter 3 to display   
Enter 4 to stop   
1
Enter the value for push 
33
Enter 1 for push  into stack 
Enter 2 for  pop into stack   
Enter 3 to display   
Enter 4 to stop   
2
Enter 1 for push  into stack 
Enter 2 for  pop into stack   
Enter 3 to display   
Enter 4 to stop   
2
The stack is in underflow condition
The stack view in LIFO manner: 


 */
