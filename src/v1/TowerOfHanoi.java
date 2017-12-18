package v1;

/*
 * Purpose: Data Structure and Algorithms Lab 7 Problem 2
 * Status: Complete and thoroughly tested
 * Last update: 03/22/2017
 * Submitted:  03/22/2017
 * Comment: test suite and sample run attached
 * @author: Thien Do
 * @version: 03/22/2017
 */

public class TowerOfHanoi
{

	static int count = 0;
	static int count1 = 0;
	public static void main(String[] args)
	{
		System.out.println("Input 5");
		solverTOH(5, "start", "destination", "temp");
		System.out.println(" ");
		System.out.println("Method call: " + count1 + " times");
		System.out.println("Disks move: " + count + " times");
		System.out.println("");
	}
	
	public static void solverTOH(int n, String init, String dest, String temp)
	{
		count1++;
		
		if (n > 0)
		{
				
				solverTOH(n-1, init, temp, dest); 
				System.out.println( " Move disk " + n + " from " + init + " to " + dest);
				solverTOH(n-1, temp, dest, init);	
				
				count ++;
		}
		
	}

}
