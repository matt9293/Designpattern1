package ex3;

public class Rect extends Shape {
	private double w;
	private double h;

	public Rect(double w, double h) {
		this.w = w;
		this.h = h;
	}

	@Override
	public double area() {
		return this.w * this.h;
	}

}
