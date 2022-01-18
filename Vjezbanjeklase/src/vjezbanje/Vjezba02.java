package vjezbanje;

public class Vjezba02 {
	private String name;
	private String animal;
	private int age;
	
	public Vjezba02(String name, String animal, int age) {
		this.name = name;
		this.animal = animal;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAnimal() {
		return animal;
	}

	public void setAnimal(String animal) {
		this.animal = animal;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public static void main(String[] args) {
		Vjezba02 vjezba02 = new Vjezba02(null, null, 0);
		
		vjezba02.setAge(5);
		vjezba02.setAnimal("Pas");
		vjezba02.setName("Jimmy");
		
		System.out.println(vjezba02.getAge() + " " + vjezba02.getAnimal() + " " + vjezba02.getName());
	}
}
