package week4.day1;

public class HDFCImplementationClass extends HDFC{

	@Override
	public void mandatoryKyc() {
		System.out.println("Aadhaar card");
		
	}

	@Override
	public void setDepositLimit() {
		System.out.println("25 L");
		
	}

	@Override
	public void carLoan() {
		System.out.println("60 L");
		
	}
	
	public void setPersonalLoan() {
		System.out.println("75 L");
		super.setPersonalLoan();
		}
	
	public static void main(String[] args) {
		HDFCImplementationClass option=new HDFCImplementationClass();
		option.mandatoryKyc();
		option.setDepositLimit();
		option.carLoan();
		option.setPersonalLoan();
		
		
	}
	
	

}
