class BubbleSort{
	public static void main(String args[]){
		int a[]={64,43,5,51,9,1};
		int n=6;
		for (int i=0;i<n-1;i++){
			for(int j=0;j<n-i-1;j++){
				if(a[j]>a[j+1]){
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("The Sorted array:");
		for(int i=0;i<n;i++)
		System.out.println(a[i]+(" "));
	}
}
