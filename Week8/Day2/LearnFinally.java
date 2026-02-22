package week8.day2;

public class LearnFinally {

	public static void main(String[] args) {
		try {
			int number=7;
			System.out.println(number/0);
		}
			    //  0   1    2}
		catch(ArithmeticException exp) {
			System.out.println("The exception is :"+exp);
		}
		
		finally {
			System.out.println("Excel sheet should be closed");
		}

	}

}
