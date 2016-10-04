package ex3;

public class AreaProductCalculator extends AreaCalculator {

	public AreaProductCalculator() {
		this.areasum = 1.0;
	}

	public void cal(Shape curShape) {
		areasum *= curShape.area();
	} // 계산만 열심히 함
}