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
			int k = in.nextInt();
			int a[] = new int[n];
			for(int i=0;i<n;i++)
			a[i] = in.nextInt();
			int sum=0;
			for(int i=0;i<n;i++)
			sum+=a[i];
			int count = 0;
				for(int i=0;i<n;i++)
				{
					if((a[i]+k)>(sum-a[i]))
					count++;
				}
				System.out.println(count);
		}
	}
}
 
