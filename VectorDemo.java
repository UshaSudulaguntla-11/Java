//Vector Example
import java.util.Vector;
public class VectorDemo{
	public static void main(String[] args){
		Vector<String>v =new Vector<>();
		//Adding elements
		v.add("Apple");
		v.add("Banana");
		v.add("Orange");
		//Printing elements
		System.out.println("Fruits:"+v);
		//Accessing elements by index
		System.out.println("First fruit:"+v.get(0));
		//Remove an element
		v.remove("Apple");
		System.out.println("Elements after removed:"+v);
		//Size and capacity
		System.out.println("Size:"+v.size());
		System.out.println("Capacity:"+v.capacity());
		//Checking if the element exists
		System.out.println("Contains Orange?:"+v.contains("Orange"));
		//Accessing First element
		System.out.println("First element:"+v.firstElement());
		//Accessing last element
		System.out.println("Last element:"+v.lastElement());
	}
}
