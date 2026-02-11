package collection;

import java.util.ArrayList;
import java.util.List;

public class Genericlistmethods {
	
	public static void main(String args[]) {
		List <String> a=new ArrayList<String> ();
		a.add("Green");
		a.add("Blue");
		a.add("Red");
		a.add("Green");
		System.out.println(a);
		a.get(2);
	    System.out.println(a.get(2));
	    a.set(1, "Black");
	    System.out.println(a);
	    System.out.println(a.indexOf("Green"));
	    System.out.println(a.lastIndexOf("Green"));
	    a.remove(2);
	    System.out.println(a);
	    System.out.println("Contains" +a.contains("Blue"));
	    
	}
}