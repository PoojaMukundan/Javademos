import java.io.*;
class Employee
{
	private int empno;
	private String empname;
	public Employee(int empno,String empname)
	{
		this.empno=empno;
		this.empname=empname;
	}
}
public class Superr extends Employee
{
	private double incentives;
	public Superr(int empno,String empname,double incentives)
	{
		super(empno,empname);
		this.incentives=incentives;
		System.out.println(""+empno+""+empname+""+incentives);
	}
public static void main(String args[])
{
	Superr sup=new Superr(101,"pooja",100.00);
	
}
}
	