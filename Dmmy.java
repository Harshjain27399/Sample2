public class Dmmy
{
 int x;
static int y;
static{
System.out.println(y);
y=5;
System.out.println(y);
}
{
System.out.println(x);
x=7;
}
public Dmmy()
{
System.out.println(x);
}
public static void main(String args[])
{
  Dmmy d1=new Dmmy();
  Dmmy d2=new Dmmy();
 
}
}