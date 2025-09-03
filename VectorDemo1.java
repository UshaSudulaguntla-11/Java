//Vector program using Integer class
import java.util.Vector;
public class VectorDemo1{
	public static void main(String[] args){
		Vector<Integer>num=new Vector<>();
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
