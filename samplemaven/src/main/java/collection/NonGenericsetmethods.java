package collection;

import java.util.HashSet;
import java.util.Set;

public class NonGenericsetmethods {
	
public static void main(String[] args) {

            Set s = new HashSet ();
			s.add("murshitha");
			s.add("jayitha");
			s.add("sreevidya");
		    Set  i = new HashSet ();
		    i.add("Gouri");
			i.add("Haritha");
			i.add("Priyanka");
			s.addAll(i);
		    System.out.println(s);
		    System.out.println(s.contains("Priyanka"));
		    System.out.println(("Priyanka"));
		    System.out.println(i.containsAll(s));
		    s.remove("murshitha");
		    System.out.println(s);
		    System.out.println(s.size());
		    s.clear();
		    System.out.println(s);

		  }
	}
		


