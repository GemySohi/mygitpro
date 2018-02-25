package day1.examples;

public class MyFirstClass{

	/*
	 * This is my first
	 * Java program.
	 * I am new to Java
	 */
	public static void main(String[] args) {


		int j = 5;
		
		switch(j){
		
		case 0:
			System.out.println("Value is 0");
			break;
		case 1:
			System.out.println("Value is 1");
			break;
		case 2:
			System.out.println("Value is 2");
			break;
		case 3:
			System.out.println("Value is 3");
		case 4:
			System.out.println("Value is 4");
		default:
			System.out.println("No value");
			break;
          }
	}
}