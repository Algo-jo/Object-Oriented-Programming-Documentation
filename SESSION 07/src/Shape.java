
public class Shape {
	protected int x, y, z;
	
	public Shape() { // Default constructor -> has no parameter
		this(0, 0, 0); // Call the same constructor that has 3 parameter
	}
	public Shape(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public void move(int dx, int dy, int dz) {
		x += dx; y += dy; z += dz;
	}

}
