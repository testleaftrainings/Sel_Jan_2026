package week8.day2;

public class LearnExceptionHandling {

	public static void main(String[] args) {
		
		
		
		try {
			int number=7;
			System.out.println(number/0);
		}
			    //  0   1    2}
		catch(ArithmeticException exp) {
			System.out.println("The exception is :"+exp);
		}
		
		try {
			int[] arr= new int[-3];
			System.out.println(arr[3]);
		}
		
		catch(ArrayIndexOutOfBoundsException exp) {
			System.out.println("The exception is :"+exp);
		}
		
		catch(Exception exp) {
			System.out.println("The exception is :"+exp);
		}
		
		
		
		System.out.println("Code completed");

	}

}
