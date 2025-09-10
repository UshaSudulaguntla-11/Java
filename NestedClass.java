class Outer{
	static int data=20;
	static class Nested{
		void display(){
			System.out.println("data is:"+data);
		}
	}
	public static void main(String[] args){
		Outer.Nested obj=new Outer.Nested();
		obj.display();
	}
}
