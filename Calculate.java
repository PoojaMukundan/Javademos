import java.io.*;
class Calculate 
{
	public int a;
	public static int cube(int a)
	{
		return(a*a*a);
	}
public static void main(String args[])
{
	Calculate c1=new Calculate();
	int r=c1.cube(5);
	System.out.println("cube:"+r);
}
}