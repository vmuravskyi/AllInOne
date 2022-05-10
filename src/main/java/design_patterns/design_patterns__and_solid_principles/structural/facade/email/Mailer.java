package design_patterns.design_patterns__and_solid_principles.structural.facade.email;

public class Mailer {

	private static final Mailer MAILER = new Mailer();
	
	public static Mailer getMailer() {
		return MAILER;
	}
	
	private Mailer() {
		
	}
	
	public boolean send(Email email) {
		return true;
	}; 
	
}
