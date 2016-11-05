package perez19;

public abstract class Printed {
	private String title;

	public Printed(String title) {
		this.title = title;
	}
	
	//Abstract method added for assignment
	public abstract String distribution();

	@Override
	public String toString() {
		return "Printed title = " + title;
	}
}
