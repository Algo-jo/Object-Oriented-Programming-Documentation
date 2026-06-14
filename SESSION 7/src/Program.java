
public class Program {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(10, 10, 100);
		Circle c1 = new Circle(50);
		
		r1.move(1, 1);
		System.out.println(r1.calcArea());
		System.out.println(c1.calcArea());
	}
}
