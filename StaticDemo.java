//static modifier
import java.io.*;
import java.util.*;
class StaticDemo
{
	static int num1;
	int num2;
	public StaticDemo()
	{
		num1++;
		num2++;
	}
	public static void main(String args[])
	{
		StaticDemo obj1=new StaticDemo();
		StaticDemo obj2=new StaticDemo();
		StaticDemo obj3=new StaticDemo();
		System.out.println("static variable"+obj3.num1);
		System.out.println("instance variable"+obj3.num2);
		System.out.println("static variable"+StaticDemo.num1);
	}
}
