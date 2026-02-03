package superkeyword;

public class Supermethodchild extends Supermethodparent {
	public void display()
	{
		//Super.display();
	System.out.println("Super method - Child");
	}

	public static void main(String[] args) {
	Supermethodchild obj=new Supermethodchild();
	obj.display();

	}

}
