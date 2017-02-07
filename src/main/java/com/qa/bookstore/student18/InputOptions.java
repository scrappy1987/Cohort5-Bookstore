package bookstore;

import java.util.List;
import java.util.Scanner;

public class InputOptions {

	private UserInput userInput;
	Service s = new Service();
	Scanner scan = new Scanner(System.in);
	
	
	void showMenu() {
		System.out.println("|       Library Menu       |");
		System.out.println("============================");
		System.out.println("|[1] Add book..............|");
		System.out.println("|[2] Remove book...........|");
		System.out.println("|[3] Display all books.....|");
		System.out.println("|[4] Purge library.........|");
		System.out.println("|[5] Quit..................|");
		System.out.println("============================");
		
	}
	
	private void execute (int command) {
		if (command == 1) s.userInputBook();
		else if (command == 2) s.userDeleteBook();
		else if (command == 3) s.viewAll();
		else if (command == 4) s.purge();
		else if (command == 5) System.exit(0);
	}
	
	
	
	
}
