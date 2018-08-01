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
			double a = in.nextDouble();
			double b = in.nextDouble();
			double arr[] = new double[n];
			double count1 = 0;
			double count2 = 0;
			for(int i=0;i<n;i++)
			{
				arr[i] = in.nextDouble();
				if(arr[i] == a)
				count1++;
				if(arr[i] == b)
				count2++;
			}
			double prob = (count1 * count2) / (n * n);
			System.out.println(prob);
		}
	}
} 
