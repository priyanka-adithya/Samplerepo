package stringpackage;

public class Stringmethods {
	public static void main(String[]args)
	{
		String s="Hello World";
		String s2 ="Welcome to java";
		String s1="java";
		String s3="JAVA";
		System.out.println("Length of the string="+s.length());
		System.out.println("Character at index 5 = "+s.charAt(5));
		System.out.println("Is String empty or not : "+s.isEmpty());
		System.out.println("After Concat : "+ s.concat(s2));
		System.out.println("Are they equal : "+s.equals(s2));
		System.out.println("Equalsignore :" + s1.equalsIgnoreCase(s3));
		System.out.println(" To uppercase: " +s1.toUpperCase());
	System.out.println("");	
	}
}
