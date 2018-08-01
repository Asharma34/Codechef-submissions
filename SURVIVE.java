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
		for(int tt=0;tt<t;tt++){
			int n=in.nextInt();
			int k=in.nextInt();
			int s=in.nextInt();
			int dec=(int)s/7;
			int tot=k*s;
			if(tot>(s-dec)*n)
			System.out.println(-1);
			else{
				if(tot%n==0)
				System.out.println(tot/n);
				if(tot%n!=0){
					int l=(int)tot/n;
					System.out.println(l+1);
				}
			}
		}
	}
} 
