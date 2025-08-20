import java.util.*;
class Roots{
	void QuadraticRoot(double a,double b, double c){
		double D=b*b-4*a*c;
		double r1=(-b-Math.sqrt(D)/2*a);
		double r2=(-b+Math.sqrt(D)/2*a);	
		System.out.print("Roots are: " + r1 + " and " + r2+"\n");
		
		if (D>0){
			System.out.print("Roots are real and unequal");
		}
		else if(D==0){
			System.out.print("Roots are real and equal");
		}
		else{
			System.out.print("Roots are imaginary");
		}
	}
	public static void main(String args[]){
		Roots R1=new Roots();
		double a,b,c;
		Scanner sc=new Scanner(System.in);
		a=sc.nextDouble();
		b=sc.nextDouble();
		c=sc.nextDouble();
		R1.QuadraticRoot( a, b, c);
	}
}
