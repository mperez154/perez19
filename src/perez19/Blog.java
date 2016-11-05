package perez19;

public class Blog extends Printed {
	private String theme;
	private String subject;

	public Blog(String title, String subject, String theme) {
		super(title);
		this.theme = theme;
		this.subject = subject;
	}

	// Adding abstract method from printed, returning distribution method
	@Override
	public String distribution() {
		return "\nDistribution: on the web\n";
	}

	// Adding distribution method to the existing toString method
	@Override
	public String toString() {
		return "Blog theme = " + theme + ", Blog subject = " + subject + ", " + super.toString() + distribution();
	}

}
