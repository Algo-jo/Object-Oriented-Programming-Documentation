package openclose;

public class Bahlil extends Enemy{
	@Override
	public void roam() {
		// TODO Auto-generated method stub
		System.out.println("Bahlil moves from: " + x);
		x++;
		System.out.println("To: " + x);
	}
}
