package abstraction;

public class Child extends AbstractionParent{
	public void show()
	{
		System.out.println("Childclass");
	}
	

	public static void main(String[] args) {
		Child obj=new Child();
		obj.display();
		obj.print();
		obj.show();
		
		}

	@Override
	public void display() {
		System.out.println("Parent-Display");
		
	}
	
	@Override
	public void print() {
		System.out.println("Parent-Print");
		
	}
}
