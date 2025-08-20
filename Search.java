import java.util.*;
class Search{
	public static void main(String args[]){
		int key;
		int a[]={11,43,32,56,6,36};
		int n=6;
		System.out.println("Enter key value:");
		Scanner sc=new Scanner(System.in);
		key=sc.nextInt();
		for(int i=0;i<n;i++){
			if(a[i]==key)
			System.out.println("Element found at index:"+i);
		}
	}
}
