package week8.day2;

import org.testng.annotations.Test;

public class LearnEnabled {
	@Test(priority = 3)
	public void deleteAccount() {
		System.out.println("deleteAccount");
    }
	
	@Test(priority = 2,enabled=false)
	public void editAccount() {
		System.out.println("editAccount");
    }
	
	@Test(priority = 1)
	public void createAccount() {
		System.out.println("createAccount");
    }
}
