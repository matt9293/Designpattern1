package ex3;

public class AreaSumCalculator extends AreaCalculator {

	public AreaSumCalculator() {
		this.areasum = 0.0;
	}

	public void cal(Shape curShape) {
		areasum += curShape.area();
	}//계산만 해라

}
