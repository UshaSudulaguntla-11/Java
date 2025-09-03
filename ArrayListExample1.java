//ArrayList program using Integer class
import java.util.ArrayList;
public class ArrayListExample1{
	public static void main(String[] args){
		ArrayList<Integer>num=new ArrayList<>();
		for(int i=1;i<=5;i++){
			num.add(i*10);
		}
		//Using for-each loop				
		System.out.println("Using for-each loop");
		for(int n:num){
			System.out.println(n);
		}
		//Using for loop
		System.out.println("Using for loop:");
		for(int i=0;i<num.size();i++){
			System.out.println(num.get(i));
		}
	}
}		
