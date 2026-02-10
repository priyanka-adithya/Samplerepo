package AssignmentInheritance;

public class Calculation  extends Employee {
	    double hra;
	    double pf;

	 public   void calculate() {
	        hra = basic * 0.05;   // 5% HRA
	        pf = basic * 0.20;    // 20% PF
	    }
	}


