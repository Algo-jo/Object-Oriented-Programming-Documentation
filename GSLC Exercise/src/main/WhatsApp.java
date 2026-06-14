package main;

public class WhatsApp extends SendMessage{
	private String number;
	public WhatsApp(String number) {
		this.number = number;
	}

	@Override
	public void send(Transaction tr) {
		System.out.println("Message of Transaction | From POSOfficial - 081234567890");
		System.out.println("To Our Beloved Customer at: " + number);
		System.out.println("Unit Price: Rp." + tr.getUnitPrice());
		System.out.println("Total Price: Rp." + tr.getTotalPrice());
		System.out.println();
	}

}
