//user defined exception
import java.io.*;
public class AgeException extends RuntimeException
{
	public static int age=0;
	public AgeException()		
	{
		System.out.println("invalid value for age");
	}
	AgeException(String msg)
	{
		super(msg);
	}
	public static void main(String args[])
	{
	if(age<=0)
	{
	try
	{
		throw new AgeException("invalid");
	}
	//catch(AgeException e)
	//{
	//	System.out.println(e);
	//}
	finally
	{
		System.out.println("exception not handled");
	}
}
else
{
	System.out.println("age entered"+age);
}
}
}
		
		