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
			int p[] = new int[n];
			int q[] = new int[n];
			int d[] = new int[n];
			double sum=0;
			for(int i=0;i<n;i++)
			{
				p[i]=in.nextInt();
				q[i]=in.nextInt();
				d[i]=in.nextInt();
				double a=(double)(p[i]+d[i]*p[i]*0.01);
				double b=(double)(a*(100-d[i])*0.01);
				double c=(p[i]-b)*q[i];
				sum+=c;
			}
			System.out.println(sum);	
		}
	}
} 
