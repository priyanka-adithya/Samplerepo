package interfaceexample;

public class Multiplechild implements MultipleParentone,MultipleParenttwo{
	public void display()
	{
		System.out.println("Class-Display");
	}
	public static void main(String args[]) {
		Multiplechild obj=new Multiplechild();
		obj.display();
		obj.print();
		obj.show();

    }

	@Override
	public void print() {
		System.out.println("Parentone-Print method");
		
	}
	@Override
	public void show() {
		
		System.out.println("Parentwo-Show method");
		
	}


}
