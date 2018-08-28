//break and contonue
import java.io.*;
class Demos
{
	public void brk()
	{
		for(int cnt=0;cnt<10;cnt++)
		{
			if(cnt==7)
			{
				break;
			}
		System.out.println(cnt);
		}
		System.out.println("end");
	}
	public void cont()
	{
		for(int cnt=0;cnt<10;cnt++)
		{
			if(cnt==7)
			{
				continue;
			}
		System.out.println(cnt);
		}
	}
}
class TestDemos
{
	public static void main(String args[])
	{
		Demos d1=new Demos();
		d1.brk();
		d1.cont();
	}
}