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
		for(int tt=0;tt<t;tt++)
		{
			int n=in.nextInt();
			int a[]=new int[n];
			int sum=0;
			for(int i=0;i<n;i++)
			{
			   a[i]=in.nextInt();
			   sum+=a[i];
			}
			if(sum%2==0) System.out.println(1);
			else System.out.println(2);
		}
	}
} 
