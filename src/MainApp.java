import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {

		String userCont; // Variable to allow the user to continue the program
		// (handle the loop)
		boolean cont = true; // Variable to control while loop and initialize
		// variable to true

		// Sysout Welcome and ask who you want to learn more about
		// System.out.println("Welcome to our Java class. Which student would
		// you like to learn more about? (enter a number 1 -5):");

		String[][] roster = { { "Armani", "Music Studio", "Dubai" }, { "Elle", "Money Printing Factory", "The Future" },
				{ "Dominique", "Holistic Nail Bar", "Cuba" }, { "Daniel", "Bank", "Hong Kong" },
				{ "Zalika", "Bakery", "Egypt" } };
		while (cont) {
			Scanner input = new Scanner(System.in);
			System.out.println(
					"Welcome to our Java class.  Which student would you like to learn more about? (enter a number 1 -5):");
			int x = input.nextInt();

			System.out.println("Student " + x + " is " + roster[x - 1][0] + ". What would you like to know about "
					+ roster[x - 1][0] + " ? " + "(enter 1 for dream job or 2 for travel):  ");
			int choice = input.nextInt();

			// make user enter in an number so I can use a switch to give
			// student info
			switch (choice) {
			case 1:
				System.out.println(roster[x - 1][0] + " dream job is " + roster[x - 1][1]);
				break;
			case 2:
				System.out.println(roster[x - 1][0] + " would love to travel to " + roster[x - 1][2]);
				break;
			}// switch end
			System.out.println("Would you like to learn about other students? (y/n): ");
			userCont = input.nextLine();
			userCont = input.nextLine();

			// If the user says yes cont = true
			// Else cont = false
			if (userCont.equalsIgnoreCase("y")) {
				cont = true;

			} else {
				cont = false;
			}//if/else statement

		} // while loop
	}// psvm
}// class
