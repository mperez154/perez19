package perez19;

public class Book extends Printed {

	private String genre;

	public Book(String title, String genre) {
		super(title);
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "Book genre = " + genre + ", " + super.toString();
	}
	
	//Adding abstract method from Printed
	@Override
	public String distribution() {
		// TODO Auto-generated method stub
		return null;
	}
}
