package week4.assignments;

public class SbiBank extends SBI {
	public void bankBalance() {
		System.out.println("200000");
	}
	public void maximumLoanAmount() {
		System.out.println("150000");
	}

	public static void main(String[] args) {
		SBI obj=new SbiBank();
		obj.bankBalance();
		obj.itLoan();
		obj.maximumLoanAmount();

	}

}
