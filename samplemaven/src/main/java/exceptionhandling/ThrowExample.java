package exceptionhandling;

public class ThrowExample 
{

public static void main(String[] args) {
		int age=19;
		if (age>=18) {
			System.out.println("Eligible for Voting");
		}
			else
			{
				throw new ArithmeticException("age under 18!!!");
			}
		}

	
}

