//this keywrd
import java.io.*;
class Vehicle
{
	int maxspeed=210;
	public void Vehicle(int maxspeed)
	{
		this.maxspeed=maxspeed;
	}
	public void showmaxspeed()
	{
		System.out.println("the top speed is"+maxspeed);
	}
public static void main(String args[])
{
	Vehicle v1=new Vehicle();
	v1.showmaxspeed();
}
}