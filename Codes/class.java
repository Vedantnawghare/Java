import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Lunch lunch = new Lunch();
		lunch.taste();
		lunch.ratings();
		
	}
}

class Lunch {
	String name = "Pizza";
	String origin = "Italy";
	String shape = "Circle";
	
	void taste() {
		System.out.println("Tasty!");
	}
	
	void ratings() {
		System.out.println("10/10");
	}
}