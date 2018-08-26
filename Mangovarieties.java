//ENUM
import java.io.*;
import java.util.*;
class Mangovarieties
{
enum Mango{carrie(10),fairchild(9);
private int price;
Mango(int p)
{
price=p;
}
int getPrice()
{
return price;
}
}
public static void main(String args[])
{
for(Mango p:Mango.values())
System.out.println(p);
}
}