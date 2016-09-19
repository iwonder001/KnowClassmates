import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		
		
		
		//Sysout Welcome and ask who you want to learn more about
		System.out.println("Welcome to our Java class.  Which student would you like to learn more about? (enter a number 1 -5):");
		
		String[][] roster = {{"Armani", "Music Studio", "Dubai"}, {"Elle", "Money Printing Factory", "The Future"}, 
			{"Dominique", "Holistic Nail Bar", "Cuba"}, {"Daniel", "Bank", "Hong Kong"}, {"Zalika", "Bakery", "Egypt"}};
		
		Scanner input = new Scanner(System.in);
		System.out.println("Which student would you like learn more about?");
		int x = input.nextInt();
		//String [] roster= new String[2]; //may need to adjust number
		//String[][] roster = new String [5][3]; //create a multi array statement.  type[] [] arrayName=new type[rowCount][columnCount];
		
		
//		Object[][] rosterName;
//		Object[][] rosterBusiness;
//		Object[][] rosterTravel;
//		rosterName [x] [0] = 1;
//		rosterBusiness [x] [1] = 2;
//		rosterTravel [x] [2] = 3; 
//		
		System.out.println("Which piece of information");
		int choice = input.nextInt(); 
		System.out.println("Name: " +roster[x - 1][choice -1]);
		
		}//psvm

	}//class


