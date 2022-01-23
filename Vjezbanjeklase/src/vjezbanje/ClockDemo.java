package vjezbanje;

import java.util.Scanner;

public class ClockDemo {
	
	public ClockDemo() {
		Clock firstClock = new Clock(10000);
		for(int i = 1;i <= 10;i++) {
			firstClock.tick();
			System.out.println(firstClock.getHMS());
		}
		Scanner ulaz = new Scanner(System.in);
		Clock secondClock = new Clock();
		System.out.print("Upiši sate za drugi sat : ");
		secondClock.setHours(ulaz.nextInt());
		System.out.print("Upiši minute za drugi sat : ");
		secondClock.setMinutes(ulaz.nextInt());
		System.out.print("Upiši sekunde za drugi sat : ");
		secondClock.setSeconds(ulaz.nextInt());
		ulaz.close();
		for(int i = 1; i <= 10;i++) {
			secondClock.tickDown();
			System.out.println(secondClock.getHMS());
		}
		System.out.println("Zbroj dva sata");
		System.out.println(firstClock.addClock(secondClock));
		System.out.println("Prvi sat");
		System.out.println(firstClock);
		System.out.println("Drugi sat");
		System.out.println(secondClock);
		System.out.println("Razlika dva sata");
		System.out.println(firstClock.subtractClock(secondClock));
	}
	
	public static void main(String[] args) {
		new ClockDemo();
	}
}
