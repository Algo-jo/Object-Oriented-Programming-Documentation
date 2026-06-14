package openclose;

public class Ferdy_Sambo extends Enemy{
	@Override
	public void roam() {
		// TODO Auto-generated method stub
		System.out.println("Sambo increases the revision from: " + x);
		x += 4;
		System.out.println("To: " + x);
	}

}
