package week4.day1;

public class Axis implements RBI {

	@Override
	public void mandatoryKyc() {
		System.out.println("DL is mandatory");
    }

	@Override
	public void setDepositLimit() {
		System.out.println("20 L");
     }

	public void setLoanLimit() {
		System.out.println("25 Cr");
	}

	public static void main(String[] args) {
		Axis axisOptions = new Axis();
		axisOptions.mandatoryKyc();
		axisOptions.setDepositLimit();
		axisOptions.setLoanLimit();

	}

}
