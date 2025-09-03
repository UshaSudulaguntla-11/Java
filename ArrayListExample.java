//Bais ArrayList Example
import java.util.ArrayList;
public class ArrayListExample{
	public static void main(String[] args){
		ArrayList<String> fruits =new ArrayList<>();
		//Adding elements
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");
		//Printing elements
		System.out.println("Fruits:"+fruits);
		//Accessing elements by index
		System.out.println("First fruit:"+fruits.get(0));
		//Remove an element
		fruits.remove("Apple");
		System.out.println("Elements after removed:"+fruits);
	}
}
