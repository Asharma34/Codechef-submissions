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
	    for(int i=0;i<t;i++){
	        int n=in.nextInt();
	        long a[][]=new long[n][n];
	        for(int j=0;j<n;j++){
	            for(int k=0;k<n;k++){
	                a[j][k]=in.nextLong();
 
	        }}
	        for(int j=0;j<n;j++)
	                 Arrays.sort(a[j]);
	           //      for(int j=0;j<n;j++){
	           // for(int k=0;k<n;k++){
 
	           //  System.out.print(a[j][k]+" ");
 
	       // }
	            // System.out.println();}
	         long max=a[n-1][n-1];
	         long nmax=0;
	         long sum=max;
	         int kk=0;
	         for(int j=n-2;j>=0;j--){
	             for(int k=n-1;k>=-1;k--){
	                 kk=k;
 
	                 if(k>=0){if(a[j][k]<max){
	                  nmax=a[j][k];
	                  max=nmax;
	                  sum+=max;
	                  break;
	                 }}
 
	                 if(k<0){
	                     kk=k;
	                     sum=-1;
	                     break;
	                 }
	             }
	             if(kk<0) break;
	         }
	         System.out.println(sum);
	    }
	}
} 
