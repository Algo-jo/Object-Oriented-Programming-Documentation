package main;

public class PrintInvoice extends SendMessage{
	private String address;
	public PrintInvoice(String address) {
		this.address = address;
	}
	
	@Override
	public void send(Transaction tr) {
		System.out.println("Invoice of Transaction | From POSOfficial - ABC Street 123");
		System.out.println("To Our Beloved Customer from: " + address);
		System.out.println("Unit Price: Rp." + tr.getUnitPrice());
		System.out.println("Total Price: Rp." + tr.getTotalPrice());
		System.out.println("Package Tax: Rp." + tr.getTax());
		System.out.println();
	}
}
