package week3.day2;

public class IPhone extends Mobile {
	
	//ChildClass extends ParentClass

	public void useAI() {
		System.out.println("useAI");

	}
	
	public static void main(String[] args) {
		IPhone iphoneOptions=new IPhone();
		iphoneOptions.useAI();
		iphoneOptions.takePhoto();
		
	
	}

}
