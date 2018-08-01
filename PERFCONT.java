/* package codechef; // don't place package name! */
 
import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int m,n;
		Scanner in=new Scanner(System.in);
	    int T=in.nextInt();
	    for(int i=1;i<=T;i++){
	    m=0;
		n=0;
	    int N=in.nextInt();
	    int P=in.nextInt();
	    for(int j=1;j<=N;j++){
	        int p=in.nextInt();
	        if(p>=P/2)
	        m=m+1;
	        if(p<=P/10)
	        n=n+1;
	    }
	    if(m==1&&n==2)
	    System.out.println("yes");
	    else System.out.println("no");
	    }
	}
}
