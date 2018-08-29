//assertion
import java.io.*;
public class Validateage
{
	public static void main(String[] args)
	{
		int age=Integer.parseInt(args[0]);
		assert(age>0) && (age<130):"Invalid age";
		{
		System.out.println("entered age is"+age);
		}
	}
}
