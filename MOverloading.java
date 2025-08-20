class MOverloading{
	void display(int a,int b){
		System.out.println("Integer:"+a+" and "+b);
	}
	void display(String a){
		System.out.println("String:"+a);
	}
	void display(float a,float b){
		System.out.println("Double:"+a+" and "+b);
	}
	public static void main(String args[]){
		MOverloading m1=new MOverloading();
		m1.display(2,3);
		m1.display("Usha");
		m1.display(1.5f,5.5f);
	}
}
