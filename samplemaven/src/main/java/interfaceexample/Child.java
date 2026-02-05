package interfaceexample;

public class Child implements InterfaceParent {
	public void show()
	{
		System.out.println("This is the method in child class");
	}

	public static void main(String[] args) {
	Child obj=new Child();
	obj.show();
	obj.display();
	obj.print();

	}

	@Override
	public void display() {
		System.out.println("This is the display from interface parent");
		
	}

	@Override
	public void print() {
		System.out.println("This is the print from interface parent");
		
	}

}
