package week2.day1;

public class Samsung {

	public int takePhoto() {
		int numberOfPhoto = 10;
		// System.out.println(numberOfPhoto);
		return numberOfPhoto;
	}

	public int add(int a, int b) {
		int c = a + b;
		return c;
	}

	public static void main(String[] args) {
		Samsung samOptions = new Samsung();
		int number = samOptions.takePhoto();
		System.out.println(number);
		int addNumbers = samOptions.add(5, 15);

	}

}
