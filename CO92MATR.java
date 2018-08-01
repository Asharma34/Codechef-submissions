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
		   int m = in.nextInt();
		   int a[][] = new int[n][m];
		   for(int i=0;i<n;i++){
		   	for(int j=0;j<m;j++){
		   		a[i][j] = in.nextInt();
		   	}
		   }
		   int ind = 0;
		    for(int i=0;i<n;i++){
		   	for(int j=0;j<m;j++){
		   		if(a[i][j]==-1){
		   				if(i==0&&j!=0){
		   				a[i][j]=a[i][j-1];
		   			}
		   			if(i==0&&j==0) a[i][j]=1;
		   			if(i!=0&&j==0){
		   				a[i][j]=a[i-1][j];
		   			}
		   			if(i!=0&&j!=0){
		   			if(a[i][j-1]<=a[i-1][j]) a[i][j]=a[i-1][j];
		   			if(a[i][j-1]>a[i-1][j])  a[i][j]=a[i][j-1];
		   			}
		   		}
		   	/*	if(((i+1)<n)&&((j+1)<n)){
		   			if((a[i][j]>a[i+1][j]&&a[i+1][j]!=-1)||(a[i][j]>a[i][j+1]&&a[i][j+1]!=-1)){
		   				ind = 1;
		   				break;
		   			}
		   		}*/
		   		}
		   	}
		   	for(int i=0;i<n;i++){
		   	    for(int j=0;j<m;j++){
		   	        if(i+1<n){
		   	        if(a[i][j]>a[i+1][j]){
		   	            ind = 1;
		   	            break;
		   	            
		   	        }
		   	        }
		   	        if(j+1<m){
		   	            if(a[i][j]>a[i][j+1]){
		   	                ind=1;
		   	                break;
		   	            }
		   	        }
		   	    }
		   	}
		   		if(ind==1) System.out.println(-1);
		   		if(ind==0){
		   		for(int i=0;i<n;i++){
		   	                 for(int j=0;j<m;j++){
		   	              	System.out.print(a[i][j]+" ");
		   	}
		   	System.out.println();
		   		}
		   		}
		}
	}
} 
