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
	    for(int i=0;i<t;i++){
	        int a[]=new int[4];
	        for(int j=0;j<4;j++)
	        a[j]=in.nextInt();
	        int m=0;
	        for(int j=0;j<4;j++){
	            for(int k=j+1;k<4;k++){
	                if(a[j]==a[k])
	                 m++;
	            }    
	        }
	       if(m==2||m==6)
	       System.out.println("YES");
	       else System.out.println("NO");
	        }
	    }
}
 
