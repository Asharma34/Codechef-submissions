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
		int t=in.nextInt();
		for(int i=0;i<t;i++){
		    int w=in.nextInt();
		    String s=in.next();
		    int beg=0;
		    int num=2*(int)s.charAt(0)+(int)s.charAt(1);
		    switch(num){
		        case(329):beg=0;
		        break;
		        case(349):beg=1;
		        break;
		        case(339):beg=2;
		        break;
		        case(336):beg=3;
		        break;
		        case(318):beg=4;
		        break;
		        case(327):beg=5;
		        break;
		        case(347):beg=6;
		        break;
		    }
		    int a[]=new int[7];
		   if(w==28){
		   for(int j=0;j<7;j++)
		   System.out.print(4+" ");
		   }
		   if(w==29){
		       for(int j=0;j<7;j++)
		       a[j]=4;
		       a[beg]=5;
		       for(int j=0;j<7;j++)
		   System.out.print(a[j]+" ");
		   }
		   if(w==30){
		       for(int j=0;j<7;j++)
		       a[j]=4;
		       if(beg==6){
		           a[6]=5;
		           a[0]=5;
		       }
		       else{
		           a[beg]=5;
		           a[beg+1]=5;
		       }
		       for(int j=0;j<7;j++)
		   System.out.print(a[j]+" "); 
		   }
		   if(w==31){
		       for(int j=0;j<7;j++)
		       a[j]=4;
		       if(beg==5){
		           a[5]=5;
		           a[6]=5;
		           a[0]=5;
		       }
		       if(beg==6){
		           a[6]=5;
		           a[0]=5;
		           a[1]=5;
		       }
		       if(beg!=5&&beg!=6){
		           a[beg]=5;
		           a[beg+1]=5;
		           a[beg+2]=5;
		       }
		         for(int j=0;j<7;j++)
		   System.out.print(a[j]+" ");
		   }
		   System.out.println();
		}
}
}
