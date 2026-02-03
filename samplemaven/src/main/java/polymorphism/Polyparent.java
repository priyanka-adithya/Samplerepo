package polymorphism;

public class Polyparent {
	public void print(int a,int b){
		int c=a+b;
		System.out.println("The sum is"+c);
		
	}

	public static void main(String[] args) {
		Polyparent obj=new Polyparent();
		obj.print(18, 10);

	}

}
