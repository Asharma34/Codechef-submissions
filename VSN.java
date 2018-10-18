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
		for(long tst=0;tst<t;tst++)
	{
		double hibro = in.nextDouble();
		double px = in.nextDouble();
		double py = in.nextDouble();
		double pz = in.nextDouble();
		double qx = in.nextDouble();
	        double qy = in.nextDouble();
		double qz = in.nextDouble();
		double dx = in.nextDouble();
		double dy = in.nextDouble();
		double dz = in.nextDouble();
		double cx = in.nextDouble();
		double cy = in.nextDouble();
		double cz = in.nextDouble();
		double r = in.nextDouble();
		double k = (Math.pow((px-cx),2)) + (Math.pow((py-cy),2)) + (Math.pow((pz-cz),2)) - (Math.pow(r,2));
		double c1 = (px-qx)*(px-cx)+(py-qy)*(py-cy)+(pz-qz)*(pz-cz);
		double c2 = dx*(px-cx)+dy*(py-cy)+dz*(pz-cz);
		double c3 = (Math.pow((qx-px),2)) + (Math.pow((qy-py),2)) + (Math.pow((qz-pz),2));
		double c4 = 2*(dx*(px-qx)+dy*(py-qy)+dz*(pz-qz));
		double c5 = dx*dx + dy*dy + dz*dz;
		double a = k*c5 - c2*c2;
		double b = 2*c1*c2 - k*c4;
		double c = c3*k - c1*c1;
		if(a != 0){
		double root1 = (-b + Math.pow((b*b-4*a*c),0.5))/(2.0*a);
		double root2 = (-b - Math.pow((b*b-4*a*c),0.5))/(2.0*a);
		if(root1 > 0 && root2 > 0)
		{
			if(root1 <= root2) System.out.println(root1);
			else System.out.println(root2);
		}
		if(root2 <= 0) System.out.println(root1);
		if(root1 <= 0) System.out.println(root2);
		}
		if(a == 0){
		double root = -(c/b);
		System.out.println(root);
		} 
	}
	}
} 
