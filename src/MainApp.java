import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		
		
		
		//Sysout Welcome and ask who you want to learn more about
		//System.out.println("Welcome to our Java class.  Which student would you like to learn more about? (enter a number 1 -5):");
		
		String[][] roster = {{"Armani", "Music Studio", "Dubai"}, {"Elle", "Money Printing Factory", "The Future"}, 
			{"Dominique", "Holistic Nail Bar", "Cuba"}, {"Daniel", "Bank", "Hong Kong"}, {"Zalika", "Bakery", "Egypt"}};
		
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to our Java class.  Which student would you like to learn more about? (enter a number 1 -5):");
		int x = input.nextInt();
		
		System.out.println("Student " + x + " is " + roster [x-1] [0] + ". What would you like to know about " + roster [x-1] [0] + " ? "
				+ "(enter 1 for dream job or 2 for travel):  " ); 
		
		
		
	}//psvm
}//class
		//String [] roster= new String[2]; //may need to adjust number
		//String[][] roster = new String [5][3]; //create a multi array statement.  type[] [] arrayName=new type[rowCount][columnCount];
		
//		
////		Object[][] rosterName;
////		Object[][] rosterBusiness;
////		Object[][] rosterTravel;
////		rosterName [x] [0] = 1;
////		rosterBusiness [x] [1] = 2;
////		rosterTravel [x] [2] = 3; 
//		
//		System.out.println("Would you like to hear more about this person? (enter dream job or travel):");
//		int choice = input.nextInt(); 
//		
//		if (inputBikiniBash.equalsIgnoreCase("y")) {
//			bikiniBash = true;
//		}
//
//		//if user says y they want  then they are given 3 clothing options which will be in a switch
//		//partyWear will hold bikini, naked or snowsuit answer
//		if (bikiniBash) {
//			System.out.println(
//					"Well choosen grasshopper!!! What are you going to wear to said party? (Bikini/Naked/Snowsuit) ");
//			partyWear = input.nextLine();
//
//			//why is "bikini", etc is quotation marks?
//			switch (partyWear) {
//			case "bikini":
//				System.out.println("Got drunk and you lost your bikini bottom. Run home!");
//				break;
//			case "naked":
//				System.out.println("Why are you naked you FREAK! You are denied entry.");
//				break;
//			case "snowsuit":
//				System.out.println("Really? GO HOME!!");
//				break;
//			}
//
//			//if user answers no to attending bikiniBash user will then be asked if they want to attend a Crossword party
//		} else {
//		
//		System.out.println("Would you like to hear more about this person? (enter dream job or travel):");
//		int choice = input.nextInt(); 
//		System.out.println("Name: " +roster[x - 1][choice -1]);
//		
//		}//psvm
//
//	}//class


