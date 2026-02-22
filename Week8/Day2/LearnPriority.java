package week8.day2;

import org.testng.annotations.Test;

public class LearnPriority {
	@Test(priority = 1)
	public void deleteAccount() {
		System.out.println("deleteAccount");
    }
	
	@Test(priority = 1)
	public void editAccount() {
		System.out.println("editAccount");
    }
	
	@Test(priority = 1)
	public void createAccount() {
		System.out.println("createAccount");
    }
	
}

//create,  edit,  delete