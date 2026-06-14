package main;

public class Main {

	public Main() {
		// this.name = "Johannes Aaron Framon"
		// this.nim = "2802428223"
	}

	public static void main(String[] args) {
		// Hardcode Transaction 7 Unit with each price of Rp10.000 
		Transaction tr = new Transaction(10000, 7);
		
		// Create object to send each transaction based on the sending type
		SendMessage invoice = new PrintInvoice("ZYX Street 098");
		SendMessage email = new Email("bayuwukwuk@gmail.com");
		SendMessage whatsapp = new WhatsApp("ZYX Street 098");
		
		// Sending message 
		invoice.send(tr);
		email.send(tr);
		whatsapp.send(tr);
	}

}
