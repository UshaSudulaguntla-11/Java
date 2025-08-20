import java.util.Scanner;
class Factorial{
	public static void main(String args[]){
		int num;
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		int factorial=1;
		num=sc.nextInt();
		for (int i=1; i<=num ; i++)
		factorial *= i;
		System.out.println("the Factorial is :"+factorial);
		
	}
}

