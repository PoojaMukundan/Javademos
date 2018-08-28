import java.io.*;
class Employee
{
	private int empno;
	private String empname;
	public Employee()
	{
	}
	public Employee(int empno,String empname)
	{
		empno=empno;
		empname=empname;
	}
public class Super extends Employee
{
	private float incentives;
	public SuperDemo(int empno,String empname,float incentives)
	super(empno,empname);
	this.incentives=incentives;
	