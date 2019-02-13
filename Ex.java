class Parent 
{
 static int y=4;
}
class Child extends Parent
{
 static int y;
 static
{
 y=5;
}
}
public class Ex
{
public static void main(String args[])
{
System.out.println(Child.y);
}
}