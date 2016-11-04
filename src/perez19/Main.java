package perez19;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("TEST");

	}
	
	
}


/* Do just the two exercises below.

EXERCISE 1
Use classes Printed, Book, TextBook and Blog from the zipped examples, but add an abstract method to Printed with this signature:

    public abstract String distribution();

Implement this method in all subclasses of Printed to indicate how each subclass is distributed in print. See sample output 
for ideas but feel free to be creative with the String returned by distribution().


Create an executable class that:
	•creates a GenericStack object like this:   GenericStack<Printed> stack = new GenericStack<>();
	•add a Book, TextBook, and Blog to stack. Add all of them anonymously.
	•try to add an instance of Printed and explain why it won't work in a comment.
	•call a public generic method named show with stack as its only argument.
	•defines the public generic method named show to process the stack passed into it and report both the 
	 attributes and distribution method for each element on the stack. See Sample Output.

SAMPLE OUTPUT
Blog theme = election funding, Printed title = Jeb!
Distributed on the web
TextBook subject = Mathematics, Book genre = educational, Printed title = Calculus
Distributed by campus bookstores
Book genre = historical fiction, Printed title = War and Peace
Distributed by Amazon


EXERCISE 2
Create an ArrayList of Objects. Add the following objects to the list in any order:
	•a Rectangle
	•a Circle
	•a String
	•an Integer

Write and call a void method that takes the list as its sole argument:
	•process the list with a loop
	•inside the loop, display the areas of both the Circle and Rectangle objects but run toString() for the String and Integer.

SAMPLE OUTPUT
Area is 50.0
James Gosling
12
Area is 95.03317777109125
*/