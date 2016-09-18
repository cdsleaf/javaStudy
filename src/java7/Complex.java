package java7;

public class Complex {
	private final double real;
	private final double imaginary;
	
	public Complex(final double r, final double i){
		this.real = r;
		this.imaginary = i;
	}
	
	public Complex add(final Complex other){
		return new Complex(this.real + other.real, this.imaginary+other.imaginary);
	}
	
	@Override
	public boolean equals(Object o){
		if(this == o){
			return true;
		}
		
		if(o == null || getClass() != o.getClass()){
			return false;
		}
		
		Complex complex = (Complex) o;
		if(Double.compare(complex.imaginary, imaginary) !=0){
			return false;
		}
		
		if(Double.compare(complex.real, real) != 0){
			return false;
		}
		
		return true;
	}
}
