package day1.examples;

public class bankAccountTester {

	public static void main(String[] args) {
		bankaccount tester = new bankaccount(0);
		tester.deposit(1000);
		System.out.println(tester.getBalance());
		tester.withdraw(500);
		System.out.println(tester.getBalance());
		System.out.println();
		tester.withdraw(400);
		System.out.println(tester.getBalance());
		System.out.println("Expecting result:100.0");

	}

}
