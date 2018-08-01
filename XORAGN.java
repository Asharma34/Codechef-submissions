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
		for(int tst = 0;tst < t;tst++)
		{
			int n = in.nextInt();
			long a[] = new long[n];
			for(int i = 0;i < n;i++)
			a[i] = in.nextLong();
			
			long b[] = new long[n];
			for(int i=0;i<n;i++)
			b[i] = 2*a[i];
			long xor = 0;
			for(int i=0;i<n;i++)
			{
			 xor = b[i] ^ xor;
			}
			System.out.println(xor);
		}
	}
} 
