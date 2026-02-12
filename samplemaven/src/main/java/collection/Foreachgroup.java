package collection;

import java.util.HashSet;
import java.util.Set;

public class Foreachgroup {

	public static void main(String[] args) {
		Set <String> a=new HashSet <String> ();
		a.add("red");
		a.add("green");
		a.add("blue");
		System.out.println(a);
		for (String b: a)
		{
			System.out.println(b);
		}

	}

}
