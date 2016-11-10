package perez19;

import java.util.ArrayList;

public class Exercise2 {

	public static void main(String[] args) {

		// New Array List
		ArrayList<Object> list = new ArrayList<>();

		// Adding elements to ArrayList
		list.add(new Rectangle(25, 25));
		list.add(new Circle(25));
		list.add("James Gosling");
		list.add(12);

		// Calling void generic Method
		displayList2(list);
	}
	// Referred to sample on page 748 for help with this generic method
	public static <E extends GeometricObject> void displayList2(ArrayList<Object> object) {
		// Standard for loop
		for (int i = 0; i < object.size(); i++) {
			// updated with your help to use instanceof operator instead of getClass() method
			if (object.get(i) instanceof perez19.Rectangle) {
				System.out.println("Rectangle Area is " + ((Rectangle) object.get(i)).getArea());
			} else if (object.get(i) instanceof perez19.Circle) {
				System.out.println("Circle Area is " + ((Circle) object.get(i)).getArea());
			} else System.out.println(object.get(i).toString());
		}
	}
}