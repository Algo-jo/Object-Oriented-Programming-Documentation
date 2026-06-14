package openclose;

public class Jurike extends Enemy{
	@Override
	public void roam() {
		// TODO Auto-generated method stub
		System.out.printf("Jurike moves from: %d, %d\n", x, y);
		x += 2;
		y += 2;
		System.out.printf("To: %d %d\n", x, y);
	}

}
