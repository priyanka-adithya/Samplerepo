package polymorphismassignment;

public class OffSeason extends Season {
public  void discount(double amount) 
      {
        double discount = amount * 0.15;
        double finalAmount = amount - discount;
        System.out.println("Off Season Discount: 15%");
        System.out.println("Final Amount to Pay: " + finalAmount);
    }
}



	