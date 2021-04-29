import java.io.*;
/*Tempareture of liquid water*/

class LiquidTemparetureException extends Exception
{
	int value;
	LiquidTemparetureException(int v)
	{
		value =v;
	}	

}
class TempExceptionTest
{
	static void evaluate(int value) throws LiquidTemparetureException 
	{
		if(value>0 && value<100)
			System.out.print("\n\tYou have entered "+value+"\n\tThankyou.");
		else
			throw new LiquidTemparetureException (value); 			
	
	}
	public static void main(String args []) throws IOException
	{
		int value;
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		try
		{
			System.out.print("\n\tPlease enter  liquid tempareture :");
			value=Integer.parseInt(br.readLine());
			evaluate(value);
		}
		catch(IOException e)
		{
			System.out.print("\n\tThis is an input output exception.");
		}
		catch(NumberFormatException e)
		{
			System.out.print("\n\tPlease enter a valid integer number.");
		}	

		catch(LiquidTemparetureException e)
		{
			System.out.print("\n\tYou have entered : "+e.value);
			System.out.print("\n\tIt cannot be in the liquid's temperature."); 	
		}
    finally
    {
       System.out.print("\n\tDone by Soubhagya Paul.");
    }
	}
}
