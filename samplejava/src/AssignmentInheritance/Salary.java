package AssignmentInheritance;

public class Salary extends Calculation {
   double totalSalary;

	public void total() {
	        totalSalary = basic + hra + bonus - pf - deduction;
	    }

public void display() 
     {
	        System.out.println("SALARY SLIP");
	        System.out.println("Basic Pay   : " + basic);
	        System.out.println("HRA         : " + hra);
	        System.out.println("PF          : " + pf);
	        System.out.println("Bonus       : " + bonus);
	        System.out.println("Deduction   : " + deduction);
	        System.out.println("Total Salary by Hand: " + totalSalary);
      }
	    
public static void main(String[] args) {
	        Salary s = new Salary();
	        s.calculate();
	        s.total();
	        s.display();
	    }
	}

