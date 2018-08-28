import java.io.*;
class Calc
{
	public void check(int a,int b,int c)
	{
		if((a>b) && (a>c))
		{
			System.out.println("a is greater");
		}
		else if((b>a) && (b>c))
		{
			System.out.println("b is greater");
		}
		else
		{
			System.out.println("c is greater");
		}
	}
public static void main(String args[])
{
	Calc c1=new Calc();
	c1.check(10,42,23);
}
}