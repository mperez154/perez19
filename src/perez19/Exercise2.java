package perez19;

import java.util.ArrayList;

import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class Exercise2 {

	public static void main(String[] args) {
		
		ArrayList<Object> list = new ArrayList<>();
				
		list.add(new Rectangle(25,25));
		list.add(new Circle(25));
		list.add("James Gosling");
		list.add(12);
		
		Rectangle rectangle = new Rectangle(25,25);
		
		System.out.print("Circle area is ");
		//System.out.println(Exercise2.<Rectangle>displayList(rectangle));
		
		
	}
	
	//See MyGenericMethod demo for sample output
	public static <E extends GeometricObject> double displayList(E shape)
	{			
		return shape.getArea();	
	}
}

/*
 * Write and call a void method that takes the list as its sole argument:
 * •process the list with a loop •inside the loop, display the areas of both the
 * Circle and Rectangle objects but run toString() for the String and Integer.
 * SAMPLE OUTPUT Area is 50.0 James Gosling 12 Area is 95.03317777109125
 */