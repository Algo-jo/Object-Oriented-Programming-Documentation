
public class Rectangle extends Shape {
	private int edge;
	public Rectangle(int x, int y, int edge) {
		super(x, y, 0);
		this.edge = edge;
	}

	public int calcArea() {
		return edge * edge;
	}

	public void move(int dx, int dy) {
		x += dx; y += dy;
	}

}


//this.x = x;
//this.y = y;

//public Rectangle(int x, int y, int z) {
//super(x, y, z);
//// TODO Auto-generated constructor stub
//}