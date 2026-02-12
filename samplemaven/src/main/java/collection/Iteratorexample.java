package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Iteratorexample {

	public static void main(String[] args) {
		Set <String> a=new HashSet <String> ();
		a.add("red");
		a.add("green");
		a.add("blue");
		System.out.println(a);
		Iterator it=a.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
		it.remove();
		System.out.println(a);
		
		}
}
