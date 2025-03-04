package org.bank;

public class BankInfo extends AxisBank {
	private void savings() {
		System.out.println("Money deposited in savings = Rs.2 lakhs");
	}
	private void fixed() {
		System.out.println("Money deposited in fixed = Rs.8 lakhs");
	}
	public static void main(String[] args) {
		BankInfo b = new BankInfo();
		b.savings();
		b.fixed();
		b.deposit();
		
	}
}
