package polymorphismassignment;

public class OnSeason extends Season {
public   void discount(double amount) 
      {
        double discount = amount * 0.40;
        double finalAmount = amount - discount;

        System.out.println("On Season Discount: 40%");
        System.out.println("Final Amount to Pay: " + finalAmount);
      }


public static void main(String[] args) {

        // Off season purchase
      OffSeason  obj = new OffSeason();
        obj.discount(2000);

        System.out.println();

        // On season purchase
        OnSeason obj1= new OnSeason();
        obj1.discount(2000);
    }
}