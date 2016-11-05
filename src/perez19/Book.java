package perez19;

public class Book extends Printed {

	private String genre;
	private String distribution;

	public Book(String title, String genre, String distribution) {
		super(title);
		this.genre = genre;
		this.distribution = distribution;
	}

	// Adding abstract method from Printed
	@Override
	public String distribution() {
		return "\nDistributed by: " + distribution + "\n";
	}

	@Override
	public String toString() {
		return "Book genre = " + genre + ", " + super.toString() + distribution();
	}
}