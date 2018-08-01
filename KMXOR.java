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
		    long k = in.nextLong();
		    long ans1 = 0;
		    for(int i=0;k>=Math.pow(2,i);i++){
		    	ans1 = i+1;
		    }
		    if(k==1){
		    	for(int i=1;i<=n;i++)
		    	System.out.print(1+" ");
		    }
		    if(k==2){
 
		    		System.out.print(2+" ");
		    		for(int i=1;i<n;i++)
		    		System.out.print(1+" ");
 
		    }
		    if(k>2){
		  long  ans = (long)Math.pow(2,ans1)-k-1;
		    if(n == 1) System.out.print(k);
		    else{
		    	if(ans!=0){
		    	if(n%2==0)
		    	{
		    	   System.out.print(k+" ");
		    	   for(int i=1;i<n;i++)
		    	   System.out.print(ans+" ");
		    	}
		    	if(n%2!=0)
		    	{if(ans%2==0){
		    		System.out.print(k+" "+(ans+1)+" ");
		    		for(int i=2;i<n;i++)
		    		System.out.print(1+" ");}
		    		else{
		    			if(ans!=1){
		    		System.out.print(k+" "+(ans-1)+" ");
		    		for(int i=2;i<n;i++)
		    		System.out.print(1+" ");}
		    		if(ans==1){
		    			System.out.print((k-1)+" "+3+" ");
		    			for(int i=2;i<n;i++)
		    			System.out.print(1+" ");
		    		}
		    		}
		    	}
		    }}
		    if(ans == 0&& n!=1){
		    	if(n%2!=0){
		    		for(int i=0;i<n;i++)
		    		System.out.print(k+" ");
 
		    	}
		    	else{
		    		if(n>2){
		    		System.out.print(k+" "+k+" "+(k-1)+" ");
		    		for(int i=4;i<=n;i++)
		    		System.out.print(1+" ");}
		    		if(n==2){
		    			System.out.print((k-1)+" "+1+" ");
		    		}
		    	}
		    }}
		    System.out.println();
		}
	}
}    
