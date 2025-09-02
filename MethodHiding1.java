class Parent{
	static void display(){
		System.out.println("This is display method in parent class");
	}
}
class Child extends Parent{
	static void display(){
		System.out.println("This is display method in child class");
	}
}
public class MethodHiding{
	public static void main(String[] args){
		Parent.display();
		Child.display();
		Parent p2=new Child();
		p2.display();
	}
}
