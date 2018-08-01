/* package codechef; // don't place package name! */
 
import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    	 static long maxSubArraySum(long a[])
    {
        int size = a.length;
        long max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
 
        for (int i = 0; i < size; i++)
        {
            max_ending_here = max_ending_here + a[i];
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }
 
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		for(int tt=0;tt<t;tt++){
		    int n=in.nextInt();
		    int k=in.nextInt();
		    long a[]=new long[n];
		    for(int i=0;i<n;i++)
		    a[i]=in.nextLong();
		    if(k>1){
		   long b[]=new long[2*n];
		   for(int i=0;i<n;i++)
		   b[i]=a[i];
		   for(int i=n;i<2*n;i++)
		   b[i]=a[i-n];
		  long res = maxSubArraySum(b);
		    // System.out.println(res);
		    long sum=0;
		    for(int i=0;i<n;i++){
		        sum+=a[i];
		    } 
		    if(sum<0)
		    System.out.println(res);
		    else {
		        //System.out.println(res+(k-2)*sum);
		   long sum2=0;
		  long max_sum=sum2;
		    for(int i=0;i<n;i++){
		        // max_sum=sum2;
		        sum2+=a[i];
		        if(sum2>max_sum)
		        max_sum=sum2;
		    }
		    long sum3=0;
		    long max_sum2=sum3;
		    for(int i=n-1;i>=0;i--){
		   // max_sum2=sum3;
		    sum3+=a[i];
		    if(sum3>max_sum2)
		    max_sum2=sum3;
		    }
		    long resf=max_sum+max_sum2+(k-2)*sum;
		    if(res>resf) System.out.println(res);
		    if(res<=resf) System.out.println(resf);
		    }
		    }
		    if(k==1){
		        long sim=maxSubArraySum(a);
		        System.out.println(sim);
		    }
		}
	}
}
