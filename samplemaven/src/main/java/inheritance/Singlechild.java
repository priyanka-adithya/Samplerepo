package inheritance;

public class Singlechild extends Singleparent{
	public void print()
	{
		System.out.println("Child");
	}
	public static void main(String args[])
	{
		Singlechild obj =new Singlechild();
		obj.display();
		obj.print();
	}

}
