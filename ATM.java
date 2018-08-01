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
		Scanner in=new Scanner(System.in);
		int X=in.nextInt();
		double Y=in.nextDouble();
		if(X+0.5<=Y&&X%5==0){
		    double a=Y-X-0.5;
		    System.out.printf("%.2f",a);
		}else System.out.printf("%.2f",Y);
		
	}
}
 
