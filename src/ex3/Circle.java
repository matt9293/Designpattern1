package ex3;

public class Circle extends Shape {
	private double r;
	

	public Circle(double r) {
		this.r = r;
	}

	@Override
	public double area() {
		return this.r * this.r * 3.14; 
	}

}
