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
			int x = in.nextInt();
			int i=1;
		for(i=1;;i++)
		{
			if(x<=i*(i+1)/2)
			break;
		}
		if(x==i*(i+1)/2) System.out.println(i);
		if(x<i*(i+1)/2)
		{
			int m = i+(i*(i+1)/2)-x;
			int n = i-1+x-i*(i-1)/2;
			if(m<=n) System.out.println(m);
			if(n<m) System.out.println(n); 
		}
		}
	}
} 
