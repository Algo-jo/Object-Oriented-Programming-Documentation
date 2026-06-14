package SRP;

public class EmailService { // Gak pake extends kurang nyambung: Association instead
	private User from, to;
	private String subject, msg;
	public EmailService(User from, User to, String subject, String msg){
		this.from = from;
		this.to = to;
		this.subject = subject;
		this.msg = msg;
	}
	public void sendEmail(String to) {
		// todo code for sending email
	}
}
