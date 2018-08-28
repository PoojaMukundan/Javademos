import java.io.*;
class Student
{
	public void display()
	{
		int x=1;
		int y=x++;
		System.out.println(x);
		System.out.println(y);
	}
	public void demo()
	{
		int a=10;
		int f=a++ + ++a;
		System.out.println(f);
		System.out.println(f++);
		System.out.println(a);
	}
}
class TestStudent
{
	public static void main(String args[])
	{
	Student s1=new Student();
	s1.display();
	s1.demo();
	}
}