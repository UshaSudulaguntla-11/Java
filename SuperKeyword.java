class Parent{
	int a=50;
	Parent(){
		System.out.println("This is Parent class Constructor");
	}
	void display(){
		System.out.println("This is parent class method");
	}
}
class Child extends Parent{
	int a=60;
	Child(){
		super();
		System.out.println("This is child class constructor");
	}
	void show(){
		System.out.println("Child number:"+a);
		System.out.println("Parent number:"+super.a);
		super.display();
	}
}
public class SuperKeyword{
	public static void main(String[] args){
		Child c=new Child();
		c.show();
	}
}
