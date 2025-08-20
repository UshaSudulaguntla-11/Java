import java.util.Scanner;
//Reversing an array
public class ArrayReverse
{
	public static void main(String[] args)
	{
		//creating a scanner class
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		//declaring size of an array
		int n=s.nextInt();
		System.out.println("Enter the elements:");
		//reading array elements
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		//reversing array elements
		System.out.println("Revering an array:");
		for(int i=n-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
	}
}
