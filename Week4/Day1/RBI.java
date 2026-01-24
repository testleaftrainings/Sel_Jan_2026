package week4.day1;

public interface RBI {
	
	//Abstract methods
	//Design
	
	public void mandatoryKyc();
	
	public void setDepositLimit();
	
	//Can be overrided
	default void setLoanLimit() {
		System.out.println("50 cr");
	}
	
	//Cannot not override
	static void houseLoan() {
		System.out.println("1 Crore");
	}

}
