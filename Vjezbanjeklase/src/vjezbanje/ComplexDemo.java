package vjezbanje;

public class ComplexDemo {
	public ComplexDemo(){
		Complex com1 = new Complex(5.5, 3.5);
		
		System.out.println(com1.add(new Complex(3.7, 1.2)));
		System.out.println(com1.subtract(new Complex(3.1, 5.3)));
		System.out.println(com1.divide(new Complex(2.1, 2.5)));
		System.out.println(com1.multiply(new Complex(1.4, 4.6)));
	}
	
	public static void main(String[] args) {
		new ComplexDemo();
	}
}
