package week3.day2;

public class IPhone17Pro extends IPhone {
	
	public void makeCall() {
		System.out.println("makeCall");
    }
	public static void main(String[] args) {
		IPhone17Pro proOptions=new IPhone17Pro();
		proOptions.makeCall();
		proOptions.useAI();
		proOptions.takePhoto();
	}
	

}

//     1                  1              1
//IPhone17Pro extends IPhone extends Mobile
//    3                  2             1