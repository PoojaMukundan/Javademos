//METHOD LOCAL INNER CLASS
class Transaction
{
public void withDraw(double amount)
{
 class Account
{
	private double balance=10000;
	public void debit()
{
	System.out.println("current amt=Rs:"+balance);
	balance=balance-amount;
	System.out.println("date"+new java.util.Date());
	System.out.println("amt debited");
	System.out.println("amt remaining=Rs:"+balance+"/");
}
}
Account ac=new Account();
ac.debit();
System.out.println("plz collect ur cash=Rs:"+amount);
}
}
class LocalInner
{
public static void main(String args[])
{
double amt=4000;
Transaction ts=new Transaction();
ts.withDraw(amt);
}
}	
	