package v1;

import java.math.BigInteger;
import java.io.*;

/*
 * Purpose: Data Structure and Algorithms Lab 7 Problem 1
 * Status: Complete and thoroughly tested
 * Last update: 03/22/2017
 * Submitted:  03/22/2017
 * Comment: test suite and sample run attached
 * @author: Thien Do
 * @version: 03/22/2017
 */

public class Factorial
{
	static BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		System.out.println(rIFactorial(13));
		System.out.println(rLFactorial(21));
		
	
		String currentLine;
		
		while(!(currentLine = stdin.readLine()).trim().equals("q"))
		{	
			
			BigInteger factorial = rBFactorial(BigInteger.valueOf(Integer.parseInt((currentLine))));
			System.out.print( " = " + factorial + "\n");
		}
	}

	// integer max         = 2,147,483,647
	// 13!             = 6,227,020,800
	// rIFactorial(13) = 1,932,053,504
	// It fails at 13! .. Fix this by make int type to long type
	public static int rIFactorial(int n)
	{
		int resultI;
		
		if (n == 0)
		{
			resultI = 1;
		}
		else
		{
			if(n == 1)
			{
				System.out.println("1");
			}
			else
			{
				System.out.println(n + "!");
			}
			
			resultI =  rIFactorial(n-1) * n ;
		}
		
		return resultI;
	}
	
	// long max         = 9,223,372,036,854,775,807
	// 21!              = 51,090,942,171,709,440,000
	// rLFactorial(13)  = -4,249,290,049,419,214,848
	// It fails at 21! .. Fix this by make long type to BigInteger
	public static long rLFactorial(long n)
	{
		long resultL;
		
		if (n == 0)
		{
			resultL = 1;
		}
		else
		{
			if(n == 1)
			{
				System.out.println("1");
			}
			else
			{
				System.out.println(n + "*");
			}
			
			resultL = n * rLFactorial(n-1);
		}
		
		return resultL;
	}
	
	// It fails at 6487! due to stack over flow.
	public static BigInteger rBFactorial(BigInteger n)
	{
		BigInteger resultB = BigInteger.valueOf(1);
		
		if (n.equals(BigInteger.valueOf(0)))
		{
			resultB = BigInteger.valueOf(1);
		}
		else
		{
			if(n.equals(BigInteger.valueOf(1)))
			{
				System.out.println("1");
			}
			else
			{
				System.out.println(n + "*");
			}	
			
			resultB = n.multiply(rBFactorial(n.subtract(BigInteger.valueOf(1))));
		}
		
		return resultB;
	}
}
