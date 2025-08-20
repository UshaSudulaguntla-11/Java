import java.util.Scanner;
public class Even
{
	public static void main(String[] args)
	{
		// using scanner
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		//declaring size of an array
		int n=s.nextInt();
		System.out.println("Enter array elements:");
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Determing the elements as even or 0dd");
		//checking whether even or odd
		for(int i=0;i<n;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]+":Even");
			}
			else
			{
				System.out.println(a[i]+":Odd");
			}
		}
	}

}		
