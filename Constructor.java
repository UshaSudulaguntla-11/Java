import java.util.Scanner;
class Constructor{
	String name;
	String roll;
	Constructor(){
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter name:");
		name=sc.nextLine();
		System.out.println("Enter roll:");
		roll=sc.nextLine();
		System.out.println("Name: "+name);
		System.out.println("Roll.no: "+roll);
	}
	Constructor(String name ,String roll){
		this.name =name;
		this.roll=roll;
	}
	
	public static void main(String args[]){
		Constructor c1=new Constructor();
		Constructor c2=new Constructor("Usha","24pa1a05l9");
		System.out.println(c2.name);
	}
}
