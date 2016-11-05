package perez19;

import java.util.ArrayList;

import com.sun.javafx.geom.Rectangle;

import javafx.scene.shape.Circle;

public class Exercise2 {

	public static void main(String[] args) {
			
		
		
		ArrayList<Object> list = new ArrayList<>();
		
		list.add(new Rectangle(25, 25, 25, 25));
		list.add(new Circle(50));
		list.add("Test");
		list.add(5);
		
		displayList(list);

	}
	
	//Referenced page 743 for help with this
	public static <E> void displayList(ArrayList<Object> list)
	{
		for(int i = 0; i < list.size(); i++)
		{
			list.get(i).toString();
		}
	}

}

/*
 *READ PAGES 739 - 745 FOR HELP WITH THIS
 *
 * EXERCISE 2 Create an ArrayList of Objects. Add the following objects to the
 * list in any order: 病 Rectangle 病 Circle 病 String 病n Integer
 * 
 * Write and call a void method that takes the list as its sole argument:
 * 頻rocess the list with a loop 品nside the loop, display the areas of both the
 * Circle and Rectangle objects but run toString() for the String and Integer.
 * 
 * SAMPLE OUTPUT Area is 50.0 James Gosling 12 Area is 95.03317777109125
 */