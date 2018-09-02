//abstract metd
 abstract class Shape
{
	double dim1,dim2;
	public Shape(double d1,double d2)
	{
		dim1=d1;
		dim2=d2;
	}
	public abstract double area();
	
} 
	public class Rectangle extends Shape
	{
		public Rectangle(double d1,double d2)
		{
			super(d1,d2);
		}
		public double area()
		{
			return dim1*dim2;
		}
        	public static void main(String args[])
		{
		Rectangle r1=new Rectangle(20,30);
		System.out.println(""+r1.area());
		}
	} 