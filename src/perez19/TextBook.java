package perez19;

public class TextBook extends Book {
	private String subject;

	public TextBook(String title, String genre, String distribution, String subject) {
		super(title, genre, distribution);
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "TextBook subject = " + subject + ", " + super.toString();
	}
}
