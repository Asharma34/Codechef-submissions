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
			int a[] = new int[n];
			int b[] = new int[n];
			for(int i=0;i<n;i++)
			a[i] = in.nextInt();
			for(int i=0;i<n;i++)
			b[i] = in.nextInt();
			
			Arrays.sort(a);
			Arrays.sort(b);
			int suma = 0;
			int sumb = 0;
			for(int i=0;i<n-1;i++)
			{
				suma += a[i];
				sumb += b[i]; 
			}
			if(suma<sumb) System.out.println("Alice");
			if(suma>sumb) System.out.println("Bob");
			if(suma==sumb) System.out.println("Draw");
		}
	}
} 
