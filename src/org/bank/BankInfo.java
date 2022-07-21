package org.bank;

public class BankInfo extends AxisBank {
private void savings() {
System.out.println("savings 10k");
}
private void fixed() {
System.out.println("fixed 30k");
} public static void main(String[] args) {
	BankInfo ban = new BankInfo();
	ban.savings();
	ban.fixed();
	ban.deposit();
}
}
