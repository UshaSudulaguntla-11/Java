import java.util.Scanner;
 class LeapYear{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year:");
		int year=sc.nextInt();
		if(isLeapYear(year)){
			System.out.println("is Leap year"+year);
		}
		else{
			System.out.println("is not Leap year"+year);
		}
	}
	public static boolean isLeapYear(int year){
			return((year%4==0 && year%100!=0)||(year%400==0));
	}
}
