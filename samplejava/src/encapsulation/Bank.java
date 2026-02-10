package encapsulation;
//Class 1: Bank (Encapsulation)

public class Bank {
	
	    private int pin;     // private data member
	    private int balance = 10000;

	    // Method to set PIN from User class
	    public void setPin(int pin) 
	      {
	        this.pin = pin;
	      }

	    // Method to validate PIN
	    private boolean validatePin() 
	       {
	        return (pin == 1001 || pin == 1234 || pin == 1212);
	       }

	    // Method to withdraw amount
	    public void withdraw(int amount) {
	        if (validatePin()) 
	           {
	            if (amount <= balance) 
	               {
	                balance -= amount;
	                System.out.println("Withdrawal Successful");
	                System.out.println("Remaining Balance: " + balance);
	                } 
	            else 
	            {
	             System.out.println("Insufficient Balance");
	            }
	          }
	        else 
	         {
	            System.out.println("Invalid PIN");
	         }
	    }
	    public static void main(String[] args) {

	        Bank bank = new Bank();
	        bank.setPin(1234);      // valid PIN
	        bank.withdraw(2500);   // withdrawal amount
	    }
	}

