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
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		for(int tst=0;tst<t;tst++)
		{
			int n=in.nextInt();
			int u=in.nextInt();
			int d=in.nextInt();
			int h[]=new int[n];
			int i;
			for(i=0;i<n;i++)
			h[i]=in.nextInt();
			int pt=0;
			for(i=0;i<n-1;i++)
			{
			if(h[i+1]>=h[i]){
			if(h[i+1]-h[i]<=u)
			continue;
			else break;
			}
			if(h[i+1]<h[i]){
			if(h[i]-h[i+1]<=d)
			continue;
			else if(pt==0){
			pt++;
			continue;
			}
			else break;
			}
			break;
			}
			System.out.println(i+1);
		}
	}
} 
