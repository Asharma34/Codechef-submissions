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
		int n = in.nextInt();
		int count[] = new int[n];
		for(int i=0;i<n;i++)
		count[i]=0;
		for(int i=0;i<n;i++)
		{
			String u = in.next();
			int l = u.length();
			for(int j=0;j<l-1;j++)
			{
				if(((int)(u.charAt(j))==99&&(int)(u.charAt(j+1))==104)||((int)(u.charAt(j))==104&&(int)(u.charAt(j+1))==101)||((int)(u.charAt(j))==101&&(int)(u.charAt(j+1))==102)){
					count[i]=1;
					
				}
			/*	if((int)(u.charAt(i))==104&&(int)(u.charAt(i+1))==101){
					count++;
				}
				if((int)(u.charAt(i))==101&&(int)(u.charAt(i+1))==102){
					count++;
				}*/
			}
		
		}
		int sum=0;
		for(int i=0;i<n;i++){
			sum+=count[i];
		}
		System.out.println(sum);
	}
}
 
