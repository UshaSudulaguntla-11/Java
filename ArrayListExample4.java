//ArrayList of Objects
import java.util.ArrayList;
class Student{
	int rollno;
	String name;
	double percentage;
	Student(int rollno,String name,double percentage){
		this.rollno=rollno;
		this.name=name;
		this.percentage=percentage;
	}
	public String toString(){
		return rollno+"-"+name+","+percentage;
	}
}
public class ArrayListExample4{
	public static void main(String[] args){
		ArrayList<Student> students=new ArrayList<>();
		students.add(new Student(101,"A",97.6));
		students.add(new Student(102,"B",87.6));
		students.add(new Student(103,"C",95.9));
		students.add(new Student(104,"D",67.9));
		for(Student i:students){
			System.out.println(i);
		}
	}
}			
