package vjezbanje;

public class Vjezba01 {
	private double radius;

	public Vjezba01() {
		radius = 1.0;
	}

	public Vjezba01(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		double Area = Math.pow(radius, 2) * Math.PI;
				
		return Area;
	}
	
	public static void main(String[] args) {
		Vjezba01 vjezba01 = new Vjezba01();
		vjezba01.setRadius(5);
		System.out.println(vjezba01.getRadius());
		System.out.println(vjezba01.getArea());
	
	}
}
