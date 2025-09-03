//Program for ArrayList
import java.util.ArrayList;
public class ArrayListExample2{
	public static void main(String[] args){
		ArrayList<String>names=new ArrayList<>();
		names.add("Usha");
		names.add("Neelima");
		names.add("Balasri");
		//Searching string name
		String searchName="Usha";
		if(names.contains(searchName)){
		System.out.println(searchName+" is in the list");
		}
		else{
		System.out.println(searchName+" is not in the list");
		}
	}
}
