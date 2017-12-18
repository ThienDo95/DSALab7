package v1;

/*
 * Purpose: Data Structure and Algorithms Lab 7 Problem 3
 * Status: Complete and thoroughly tested
 * Last update: 03/22/2017
 * Submitted:  03/22/2017
 * Comment: test suite and sample run attached
 * @author: Thien Do
 * @version: 03/22/2017
 */

public class Binomial
{

	public static void main(String[] args)
	{
		System.out.println(dC(0,0));
		System.out.println(dC(100,0));
		System.out.println(dC(100,1));
		System.out.println(dC(100,99));
		System.out.println(dC(7,7));
		System.out.println(dC(6,4));
		System.out.println(dC(6,5));
		System.out.println(dC(6,3));
		System.out.println(dC(4,2));
		
		System.out.println("");
		
		System.out.println(eC(0,0));
		System.out.println(eC(100,0));
		System.out.println(eC(100,1));
		System.out.println(eC(100,99));
		System.out.println(eC(7,7));
		System.out.println(eC(6,4));
		System.out.println(eC(6,5));
		System.out.println(eC(6,3));
		System.out.println(eC(4,2));
		
	}
	
	public static int rBinomial(int n, int k)
	{
		int result = 0;
		
		if ( k == 0 || n == k)
		{
			result = 1;
		}
		else
		{
			result = rBinomial(n-1, k) + rBinomial(n-1, k-1);
		}
		
		return result;
	}
	
	public static void iBinomial(int n)
	{
		int [][]matrix= new int [n][n];
		
		for (int c = 0; c < matrix.length; c++)
		{
			matrix[c][0] = 1;
			matrix[c][c] = 1;
		}
		
		for(int c = 2; c < matrix.length; c++)
		{
			for(int k = 1; k < matrix.length; k++)
			{
				matrix[c][k] = matrix[c-1][k] + matrix[c-1][k-1];
			}
		}
		
		for (int c = 0; c < matrix.length; c++)
		{
			for(int k = 0; k < matrix[c].length; k++)
			{
				if(matrix[c][k] != 0)
				{
					System.out.print(matrix[c][k] + "\t");
				}
			}
			System.out.println(" ");
		}
		
	}

	public static int dC(int n, int k)
	{
		int [][]matrix= new int [n+1][n-k+1];
		matrix[0][0] = 1;
		
		for (int c = 1; c < matrix.length; c++)
		{
			for (int i = 0; i < matrix[c].length; i++)
			{
				if(i == 0 || i == c)
				{
					matrix[c][i] = 1;
				}
				else if(i == 1 || c - i == 1)
				{
					matrix[c][i] = c;
				}
				else
				{
					matrix[c][i] = matrix[c-1][i] + matrix[c-1][i - 1];
				}
			}
		}
				
		return matrix[n][n-k];		
	}
		
	public static int eC(int n, int k)
	{
		int result = 1;
		
		if (k > n - k)
		{
			k = n-k;
		}
		
		for (int c = 1, j = n; c <= k; c++, j--)
		{
			result *= j;
			result /= c;
		}
		
		return result;
	}
	
}
