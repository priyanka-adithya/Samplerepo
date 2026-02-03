package polymorphism;

public class Polychild extends Polyparent{
	public void print(int a,int b)
	{
//		Super.print(18,5);
		int c=a-b;
		System.out.println("The sub is"+c);
		
	}
	public static void main(String[] args) {
		Polychild obj=new Polychild();
		obj.print(18,10);

	}

}
