package week2.day1;

public class LearnAccess1 {
	
	//depositAmount - Anyone -                 public
	//withdrawAmount - Account Holder          private
	
	public void depositAmount() {
		System.out.println("depositAmount");
	}
	
	private void withdrawAmount() {
		System.out.println("withdrawAmount");
	}
	
	public static void main(String[] args) {
		LearnAccess1 options=new LearnAccess1();
		options.depositAmount();
		options.withdrawAmount();
	}

}
