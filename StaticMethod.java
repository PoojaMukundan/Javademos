import java.io.*;
class AccessServer
{
	public static void login()
	{
		System.out.println("login called");
	}
}
public class StaticMethod
{
	public void Greet()
	{
		System.out.println("Welcme user");
	}
	public static void connect()
	{
		System.out.println("u r connected to server");
	}
	public static void main(String args[])
	{
	connect();
	StaticMethod obj=new StaticMethod();
	obj.Greet();
	AccessServer.login();
	}
}
		  