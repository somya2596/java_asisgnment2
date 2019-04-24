

public class ComplexDEmo
{ 
	public static void main(String[] args) 
	{ 
		Complex complexnumber1 = new Complex(2, 4); 
		Complex complexnumber2 = new Complex(3, 5); 
		
		Complex sum = complexnumber1.sum(complexnumber2);
		Complex difference = complexnumber1.difference(complexnumber2);
		Complex multiplication = complexnumber1.multiplication(complexnumber2);
		Complex division = complexnumber1.division(complexnumber2);
		
		System.out.println("first complex number: " + complexnumber1); 
		System.out.println("second complex number: " + complexnumber2); 
		
		System.out.println("sum of two complex numbers: " + sum); 
		System.out.println("difference of two complex numbers: " + difference);
		System.out.println("multiplication of two complex numbers: " + multiplication);
		System.out.println("division of two complex numbers: " + division);
		
	} 
	
}


