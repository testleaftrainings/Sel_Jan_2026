package week2.day1;

public class Mobile {

	public void initiateCall() {
		System.out.println("initiateCall");
	}

	public void sendMessage() {
		System.out.println("sendMessage");
	}

	public static void main(String[] args) {
		// ClassName objectName=new ClassName();
		Mobile mobileOptions = new Mobile();
		mobileOptions.initiateCall();
		mobileOptions.sendMessage();
	}

}
