import java.util.Scanner;
class Selection{
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		System.out.println("Enter size:");
		int n=s.nextInt();
		int[] a= new int[n];
		System.out.println("Enter elements: ");
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();
		Selection sel=new Selection();
		sel.sort(a);
		System.out.println("After Sorting:");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+ " ");
	}
	public static void sort(int[] a){
		int n=a.length;
		for(int i=0;i<n-1;i++){
			int temp=i;
			for(int j=i+1;j<n;j++){
				if(a[j]<a[temp])
					temp=j;
			}
			int t=a[temp];
			a[temp]=a[i];
			a[i]=t;
		}
	}
}
