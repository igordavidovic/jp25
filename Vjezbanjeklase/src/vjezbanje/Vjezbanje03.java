package vjezbanje;

public class Vjezbanje03 {
	private int year;
	private String make;
	private double speed;
	public Vjezbanje03(int year, String make, double speed) {
		this.year = year;
		this.make = make;
		this.speed = speed;
	}
	public int getYear() {
		return year;
	}
	public String getMake() {
		return make;
	}
	public double getSpeed() {
		return speed;
	}
	
	public static void main(String[] args) {
		Vjezbanje03 vjezbanje03 = new Vjezbanje03(2005, "Opel Astra", 150.0);
		
		System.out.println(vjezbanje03.getMake() + " " + vjezbanje03.getSpeed() + " " + vjezbanje03.getYear());
	}
}
