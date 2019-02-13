class A
{
	public A()
	{
		
		System.out.println("A");
	}
public A(int x)
	{
		System.out.println("A");
	}
}
class B extends A
{
  	public B()
	{
		this(3);
	 	System.out.println("B1");
	}
public B(int x)
	{
		
	 	System.out.println("B2");
	}
public B(int x,int y)
	{
		
	 	System.out.println("B3");
	}
}
public class HHH
{
	public static void main(String args[])
	{
	B b1 = new B();
	}
}