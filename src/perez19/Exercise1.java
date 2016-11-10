package perez19;

public class Exercise1 {

	public static void main(String[] args) {
		GenericStack<Printed> stack = new GenericStack<>();

		stack.push(new Book("The Lord of the Rings", "Fantasy", "Amazon"));
		stack.push(new TextBook("Managerial Accounting", "Business", "campus bookstores", "Accounting"));
		stack.push(new Blog("stackoverflow.com", "programming", "Q and A"));
		
		//Trying to add instance of Printed below		
		//stack.push(new Printed("The Lord of the Rings"));		
		//You cannot add an instance of printed because of Erasure and Restrictions on Generics


		Exercise1.<Printed>show(stack);

	}

	public static <E> void show(GenericStack<Printed> stack) {

		System.out.println(stack.pop().toString());
		for (int i = 0; i < stack.getSize(); i++) {
			// Using recursion to call the method again if there are additional elements
			show(stack);
		}
	}
}