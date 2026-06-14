
public class Circle extends Shape{
	private int r;
	
	public Circle(int r) {
		this.r = r;
	}
	
	public Circle(int x, int y, int r){
		super(x, y, 0);
		this.r = r;
	}	
	public double calcArea() {
		return Math.PI * r * r;
	}

}
