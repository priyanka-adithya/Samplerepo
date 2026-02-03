package Aggregation;

public class Aggregationtwo {
	String state;
	String city;
	Aggregationone ref;
	
	public Aggregationtwo(String state,String city,Aggregationone ref)
	{
		this.ref=ref;
		this.city=city;
		this.state=state;
	}
	public void display()
	{
		System.out.println(ref.name);
		System.out.println(ref.rollno);
		System.out.println(ref.adress);
		System.out.println(city);
		System.out.println(state);
	}
	
public static void main(String[] args)
{
	Aggregationone obj=new Aggregationone("Priyanka",29,"Kollam");
	Aggregationtwo obj1=new Aggregationtwo("Kollam","Kerala",obj);
	obj1.display(); 
	
  }
}
