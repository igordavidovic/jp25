package vjezbanje;

public class Complex {
	private double realPart;
	private double imaginaryPart;
	
	public Complex() {
		
	}
	
	public Complex(double realPart,double imaginaryPart) {
		this.realPart = realPart;
		this.imaginaryPart = imaginaryPart;
	}

	public Double getRealPart() {
		return realPart;
	}

	public void setRealPart(Double realPart) {
		this.realPart = realPart;
	}

	public Double getImaginaryPart() {
		return imaginaryPart;
	}

	public void setImaginaryPart(Double imaginaryPart) {
		this.imaginaryPart = imaginaryPart;
	}
	
	public Complex add(Complex complex) {
		Double noviRP = 0.0;
		Double noviIP = 0.0;
		if(realPart > complex.realPart) {
			noviRP = realPart + complex.realPart;
		}else {
			noviRP = complex.realPart + realPart;
		}
		if(imaginaryPart > complex.imaginaryPart) {
			noviIP = imaginaryPart + complex.imaginaryPart;
		}else {
			noviIP = complex.imaginaryPart + imaginaryPart;
		}
		
		Complex noviComplex = new Complex(noviRP, noviIP);
		return noviComplex;
	}
	
	public Complex subtract (Complex complex) {
		Double noviRP = 0.0;
		Double noviIP = 0.0;
		if(realPart > complex.realPart) {
			noviRP = realPart - complex.realPart;
		}else {
			noviRP = complex.realPart - realPart;
		}
		if(imaginaryPart > complex.imaginaryPart) {
			noviIP = imaginaryPart - complex.imaginaryPart;
		}else {
			noviIP = complex.imaginaryPart - imaginaryPart;
		}
		
		Complex noviComplex = new Complex(noviRP, noviIP);
		return noviComplex;
	}
	
	public Complex multiply(Complex complex) {
		Double noviRP = 0.0;
		Double noviIP = 0.0;
		noviRP = realPart * complex.realPart;

		noviIP = imaginaryPart * complex.imaginaryPart;
		
		Complex noviComplex = new Complex(noviRP, noviIP);
		return noviComplex;
	}
	
	public Complex divide(Complex complex) {
		Double noviRP = 0.0;
		Double noviIP = 0.0;
		if(realPart > complex.realPart) {
			noviRP = realPart / complex.realPart;
		}else {
			noviRP = complex.realPart / realPart;
		}
		if(imaginaryPart > complex.imaginaryPart) {
			noviIP = imaginaryPart / complex.imaginaryPart;
		}else {
			noviIP = complex.imaginaryPart / imaginaryPart;
		}
		
		Complex noviComplex = new Complex(noviRP, noviIP);
		return noviComplex;
	}
	
	public String ispisComplex() {
		return new StringBuilder().append(realPart).append(" + ").append(imaginaryPart).append("i").toString();
	}

	@Override
	public String toString() {
		return ispisComplex();
	}
	
	
}
