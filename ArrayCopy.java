import java.util.Arrays;
class ArrayCopy{
	public static void main(String[] args){
		int[] a={1,4,5,7,8};
		int[] b=Arrays.copyOf(a,3);
		int[] c=Arrays.copyOf(a,5);
		System.out.println("Original array:"+Arrays.toString(a));
		System.out.println("Copied array:"+Arrays.toString(b));
		System.out.println("Copied array:"+Arrays.toString(c));
	}
}
