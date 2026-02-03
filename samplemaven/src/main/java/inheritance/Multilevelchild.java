package inheritance;

public class Multilevelchild extends Multilevelparent{
public void display3()
{
	System.out.println("The child");
}
public static void main(String[] args) {
	Multilevelchild obj=new Multilevelchild();
	obj.display3();
	obj.display2();
    obj.display1();
	}
}
     