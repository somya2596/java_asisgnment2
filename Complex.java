

class Complex {
	private  double real;
	private  double imaginary;

	public Complex(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}

	public Complex sum(Complex other) {
		double realPart = this.real + other.real;
		double imaginaryPart = this.imaginary + other.imaginary;
		
		return new Complex(realPart, imaginaryPart);
		}

	public Complex difference(Complex other)

	{
		double realPart = this.real - other.real;
		double imaginaryPart = this.imaginary - other.imaginary;
		
		return new Complex(realPart, imaginaryPart);
	}
	
	public Complex multiplication(Complex other)

	{
		double realPart = this.real * other.real;
		double imaginaryPart = this.imaginary * other.imaginary;
		
		return new Complex(realPart, imaginaryPart);
	}
	
	public Complex division(Complex other)

	{
		double realPart = this.real / other.real;
		double imaginaryPart = this.imaginary / other.imaginary;
		
		return new Complex(realPart, imaginaryPart);
	}

	public double getReal() {
		return real;
	}

	public double getImaginary() {
		return imaginary;
	}

	public String toString() {
		return real + " + " + imaginary + "i";
	}
}
