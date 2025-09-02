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
		Parent p1=new Parent();
		p1.display();
		Parent p2=new Child();
		p2.display();
		Child c=new Child();
		c.display();
	}
}
