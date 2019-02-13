public class box
{
int l;
int b;
int h;
void setdata(int l,int b,int h)
{
this.l=l;
this.b=b;
this.h=h;
}
void getdata()
{
System.out.println(l+" "+b+" "+h);
}
public static void main(String args[])
{
box b1=new box();
b1.setdata(10,20,30);
b1.getdata();
}
}
