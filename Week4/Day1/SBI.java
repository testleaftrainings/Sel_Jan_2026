package week4.day1;

public class SBI implements RBI {

	@Override
	public void mandatoryKyc() {
		System.out.println("Pan is mandatory");
		
	}

	@Override
	public void setDepositLimit() {
		System.out.println("10 L");
		}
	
	public static void main(String[] args) {
		SBI sbiOptions=new SBI();
		sbiOptions.mandatoryKyc();
		sbiOptions.mandatoryKyc();
	}

}
