package main;

public class Email extends SendMessage{
	private String email;
	public Email(String email) {
		this.email = email;
	}

	@Override
	public void send(Transaction tr) {
		System.out.println("Message of Transaction | From POS Official - pos@gmail.com");
		System.out.println("To Our Beloved Customer at: " + email);
		System.out.println("Unit Price: Rp." + tr.getUnitPrice());
		System.out.println("Total Price: Rp." + tr.getTotalPrice());
		System.out.println();
	}
}
