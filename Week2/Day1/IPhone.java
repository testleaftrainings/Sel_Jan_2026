package week2.day1;

public class IPhone {
	public void takePhoto(int number) {
		// int number=8;
		System.out.println(number);
	}

	public void playGame(int gameNumber, String gameName) {
		System.out.println(gameNumber + " " + gameName);
    }

	public static void main(String[] args) {
		// ClassName objectName=new ClassName();
		IPhone iphoneOptions = new IPhone();
		iphoneOptions.takePhoto(10);
		iphoneOptions.takePhoto(100);
		iphoneOptions.playGame(1, "Freefire");
		iphoneOptions.playGame(2, "Ludo");

	}

}
