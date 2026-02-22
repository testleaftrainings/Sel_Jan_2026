package week8.day2;

public class LearnFinal {
	
	//final - variable/method/class
	//variable - the value of variable cannot be modified
	//method   - the method cannot be overrided
	//class    - the class cannot be inherited

	public static void main(String[] args) {
		final int number=7;
		
		number=number+3;
		System.out.println(number);

	}

}
