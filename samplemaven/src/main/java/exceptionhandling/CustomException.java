package exceptionhandling;

public class CustomException {

public static void main(String[] args) throws VotingException, AgeException{
		int age=19;
		if (age>=18) {
			System.out.println("Eligible for Voting");
		}
			else
			{
				throw new AgeException("age under 18!!!");
			}
		}

	
}
