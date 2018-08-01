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
			int h = in.nextInt();
			int a[] = new int[n];
			for(int i=0;i<n;i++)
			a[i] = in.nextInt();
			Arrays.sort(a);
			int r = a[n-1];
			int l = 1;
			int m = (r+l)/2;
			int f=0;
			while(r>l)
			{
			
			int count = 0;
			for(int i=0;i<n;i++)
			{
				double div = Math.ceil(((double)a[i])/m);
				count+=div;
			}
			if(count<=h)
			{          
				r=m;
				m=(int)((r+l)/2);
			}
			if(count>h)
			{
				l=m+1;
				m=(int)((l+r)/2);
			}
			}
			System.out.println(m);
		}
	}
}  
