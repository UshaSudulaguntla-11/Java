
class Rectangle
{
	double length;
	double width;
	Rectangle(double length,double width)
	{
		this.length=length;
		this.width=width;
	}
	/*double getDetails()
	{
		System.out.println(length);
		System.out.println(width);
	}*/

public String toString()
{
	return "length:"+length+",width:"+width;
}
} 
public class Rectangle1
{
	public static void main(String[] args)
	{
		Rectangle r1=new Rectangle(1,6);
		System.out.println(r1);
	}
}
	   
