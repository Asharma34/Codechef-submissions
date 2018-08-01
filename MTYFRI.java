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
		int k = in.nextInt();
		int a[] = new int[n];
		for(int i = 0;i < n;i++)
		a[i] = in.nextInt();
		int m = (int)Math.ceil(n/2.0);
		int p = (int)Math.floor(n/2.0);
		int ae[] = new int[m];
		int ao[] = new int[p];
		for(int i=0;i<m;i++)
		ae[i] = a[2*i];
		for(int i=0;i<p;i++)
		ao[i] = a[2*i+1];
		Arrays.sort(ae);
		Arrays.sort(ao);
		int temp = 0;
		int min = 0;
		if(k<=p) min = k;
		else min = p;
		for(int i=0;i<min;i++)
		{
			if(ao[i] < ae[m-i-1])
			{
				temp = ao[i];
				ao[i] = ae[m-i-1];
				ae[m-i-1] = temp;
			}
		}
		int sume = 0;
		for(int i=0;i<m;i++)
		{
			sume += ae[i];
		}
		int sumo = 0;
		for(int i=0;i<p;i++)
		{
			sumo += ao[i];
		}
		if(sumo > sume) System.out.println("YES");
		else System.out.println("NO");
	/*	for(int i=0;i<m;i++)
		System.out.println(ae[i]);
		for(int i=0;i<p;i++)
		System.out.println(ao[i]);   */
		}
	}
} 
