package StringBuildermethods;

public class Stringbuildermethods {
	public static void main(String[]args)
	{
		StringBuilder s=new StringBuilder("Java");
		s.insert(1,"Selenium");
		System.out.println("Insert :"+s);
		s.delete(9, 12);
		System.out.println("Delete :"+s);
		s.append(" Automation");
		System.out.println("Append :"+s);
		s.replace(1, 10, "ava");
		System.out.println("Replace :"+s);
		}
}
                      