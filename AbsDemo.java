import java.io.*;
abstract class Shape
{
	protected int unit;
	//abst metd declaration
	abstract protected float CalcArea();
	//non abst metd
	void display()
	{
		System.out.println("Inside display metd in abstract class");
	}
}
class Circle extends Shape
{
	public Circle()
	{
		unit=12;
	}
//abst metd implementation
	public float CalcArea()
	{
		return(float)(3.14*unit*unit);
	}
}
class Square extends Shape
{
	public Square()
	{
		unit=3;
	}
//abst metd implementation
	public float CalcArea()
	{
		return(float)(unit*unit);
	}
}
public class AbsDemo
{
	public static void main(String args[])
	{
		Shape s=new Circle();
		System.out.println("area of circle"+s.CalcArea());
		Circle c1=new Circle();
		c1.display();
		System.out.println("area of circle"+c1.CalcArea());
		Square s1=new Square();
		System.out.println("area of square"+s1.CalcArea());
		s1.display();
	}
}		
		