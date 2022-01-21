package edunova;

import java.math.BigDecimal;
import java.util.Date;

public class Start {
	
	// čitati https://github.com/tjakopec/OOP_JAVA_PHP_PYTHON_SWIFT/

	public Start() {
		Oblik o = new Oblik("a3");
		o.setName("prvi");
		System.out.println(o.getName());
		o.setName("drugi");
		System.out.println(o.getName());
		
		
		Trokut t = new Trokut("a3");
		t.setName("prvi");
		System.out.println(t.getName());
		t.setPrefix("a4");
		System.out.println(t.getName());
		
		
		Racun r = new Racun(1,new Date(),BigDecimal.ZERO,"Edunova");
		System.out.println(r.getDatum());
		System.out.println(r.getIznos());
		r.setIznos(r.getIznos().add(new BigDecimal(100)));
		
	}
	
	public static void main(String[] args) {
		new Start();
	}
}
