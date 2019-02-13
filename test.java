public class test
{
void display()
{
 show();
 System.out.println("inside display function");
}
void show()
{
 System.out.println("inside show function");
}
public static void main(String args[])
{
test t1=new test();
t1.display();
}
}
