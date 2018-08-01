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
			double xo = in.nextInt();
			double xt = in.nextInt();
			double xth = in.nextInt();
			double vo = in.nextInt();
			double vt = in.nextInt();
	                        double to = (xth-xo)/vo;
	                        double tt = (xt-xth)/vt;
	                     //   System.out.println(xo+" "+xt+" "+xth+" "+vo+" "+vt);
	                     if(to < tt) System.out.println("Chef");
	                     if(to > tt) System.out.println("Kefa");
	                     if(to == tt) System.out.println("Draw");
	                     
		}
	}
} 
