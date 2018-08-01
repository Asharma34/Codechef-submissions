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
		int T=in.nextInt();
		for(int l=0;l<T;l++){
		    int n=in.nextInt();
		    int k=in.nextInt();
		int a[] = new int[n+1];
		for(int i=1;i<=n;++i) { 
		a[i]=in.nextInt();
 int j=i;
 while(a[j]<a[j-1]&&j>0) {
 int temp=a[j];
 a[j]=a[j-1];
 a[j-1]=temp;
 --j;
 }
 }
int median=a[(int)(((n+k)/2)+1)];
System.out.println(median);
}
	}
}
 
