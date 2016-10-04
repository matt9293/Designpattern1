package ex3;

public class Main {

	public static void main(String[] args) {
		Rect r1 = new Rect(10, 20);
		Rect r2 = new Rect(100, 200);
				
		Circle c1 = new Circle(20);
		
		Triangle t = new Triangle(10, 20);

		AreaCalculator ac = new AreaProductCalculator();
		ac.addShape(r1);
		ac.addShape(r2);
		ac.addShape(c1);
		ac.addShape(t);
		
		ac.calculate();

		ConsolePrinter cp = new ConsolePrinter();
		cp.setAreaCalculator(ac); // 의존성 주입
		cp.print();
	}
}
