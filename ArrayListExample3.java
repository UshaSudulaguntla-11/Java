//Program for ArrayList
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListExample3{
	public static void main(String[] args){
		ArrayList<String>cities=new ArrayList<>();
		cities.add("Delhi");
		cities.add("Chennai");
		cities.add("Kerala");
		System.out.println("Before Sorting:"+cities);
		//Sorting cities
		Collections.sort(cities);
		//Sorting in ascending order
		System.out.println("After sorting:"+cities);
		//sorting in descending order
		Collections.sort(cities,Collections.reverseOrder());
		System.out.println("after sorting:"+cities);
	}
}
