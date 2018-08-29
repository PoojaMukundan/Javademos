//user defined exception
import java.io.*;
public class AgeException extends RuntimeException
{
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
		throw new AgeException();
	}
	catch(AgeException e)
	{
		System.out.println(e);
	}
}
else
{
	System.out.println("age entered"+age);
}
}

		
		