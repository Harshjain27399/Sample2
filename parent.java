package earlybinding;
class Early
{
	void f1()
	{
	System.out.println("f1");
	}
	void f2()
	{
	System.out.println("f2");
	}
       	void f3()
	{
	System.out.println("f3");
	}
}
class child extends Early
{
void f3()
{
System.out.println("f33");
}
void f4()
{
System.out.println("f4");
}
}

public class parent
{
public static void main(String args[])
{
Early e = new child();
e.f1();
e.f2();
e.f3();
}
}