/* package whatever; // don't place package name! */
 
import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int tst=0;tst<t;tst++)
		{
			int n = in.nextInt();
			long max1 = 0;
			long max2 = 0;
			long sum1 = 0;
			long sum2 = 0;
			long a[][] = new long[n][n];
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					a[i][j] = in.nextLong();
				}
			}
			for(int j=0;j<n;j++)
			{           
				sum1 = 0;
				sum2 = 0;
				for(int i=0;i+j<n;i++)
				{
					sum1 += a[i+j][i];
					sum2 += a[i][i+j];
					
				}
				
				if(sum1 >= max1)
				max1 = sum1;
				if(sum2 >= max2)
				max2 = sum2;
			}
			if(max1 >= max2)
			System.out.println(max1);
			else
			System.out.println(max2);
			
		}
	}
} 
