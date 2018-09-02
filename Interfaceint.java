//interface
import java.io.*;
	interface i1
	{
		double pi=3.14;
		void methdi1();
	}
	interface i3
	{
		void methdi3();
	}
	interface i2 extends i1,i3
	{
		void methdi2();
	}
class Mybase
{
	void Mybasemeth()
	{
		System.out.println("call to mybasemeth");
	}
}
public class Interfaceint extends Mybase implements i2
{
	public void circlecircum(double r)
	{
		System.out.println(" "+2*pi*r);
	}
	public void methdi2()
	{
		System.out.println("call to methi2");
	}
	public void methdi1()
	{
		System.out.println("call to methi1");	
	}
	public void methdi3()
	{
		System.out.println("call to methi3");	
	}

public static void main(String args[])
{
	Interfaceint it=new Interfaceint();
	
	it.circlecircum(4.3);
	it.methdi2();
	it.methdi1();
	it.methdi3();
}
}