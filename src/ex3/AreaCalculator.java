package ex3;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class AreaCalculator {

	public abstract void cal(Shape shape);

	public void calculate() {
		Iterator<Shape> iter = shapes.iterator();
		while (iter.hasNext()) {
			Shape curShape = iter.next();
			cal(curShape);
		}
	}

	protected ArrayList<Shape> shapes = new ArrayList<Shape>();
	protected double areasum;

	public double getAreaSum() {
		return areasum;
	}

	public void addShape(Shape s) {
		shapes.add(s);
	}

}