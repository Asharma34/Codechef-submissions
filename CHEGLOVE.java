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
		int t=in.nextInt();
		for(int tst=0;tst<t;tst++)
		{
			int n=in.nextInt();
			int l[]=new int[n];
			int g[]=new int[n];
			for(int i=0;i<n;i++)
			{
				l[i]=in.nextInt();
			}
			for(int i=0;i<n;i++)
			{
				g[i]=in.nextInt();
			}
			int i;
			int j;
			for(i=0;i<n;i++)
			{
				if(l[i]>g[i])
				break;
			}
			for(j=0;j<n;j++)
			{
				if(l[j]>g[n-j-1])
				break;
			}
			if(i==n&&j==n) System.out.println("both");
			if(i==n&&j!=n) System.out.println("front");
			if(i!=n&&j==n) System.out.println("back");
			if(i!=n&&j!=n) System.out.println("none");
		}
	}
} 
