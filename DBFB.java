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
			int m = in.nextInt();
			int n = in.nextInt();
			long a[] = new long[m];
			long b[] = new long[m];
			for(int i=0;i<m;i++)
			a[i] = in.nextLong();
			for(int i=0;i<m;i++)
			b[i] = in.nextLong();
			int N = 2;
			if(n>2) N = n;
			long result = 0;
			long sum1 = 0;
			for(int i=0;i<m;i++)
			{
				sum1 += a[i];
				sum1 = sum1%1000000007;
			}
			long sum2 = 0;
			for(int i=0;i<m;i++)
			{
				sum2 += b[i];
				sum2 = sum2%1000000007;
			}
			long fib[] = new long[N];
			fib[0] = 0;
			fib[1] = 1;
			if(N>2){
			for(int i=2;i<N;i++)
			{
				fib[i] = fib[i-1] + fib[i-2]; 
				fib[i] = fib[i]%1000000007;
			}}
	
		            long asum = sum1 * fib[N-2];
		            asum = asum%1000000007;
		            long bsum = sum2 * fib[N-1];
		            bsum = bsum%1000000007;
		            long tsum = asum + bsum;
		            tsum = tsum%1000000007;
		            result = m * tsum;
		            result = result%1000000007;
			System.out.println(result);
		//	System.out.println(sum1+" "+sum2+" "+fib[N-1]);
		}
	}
}  
