package bookstore;


import java.util.List;
import java.util.Scanner;

public class UserInput {

	private String title, ending;
	private List<String> options;
	private Scanner scanner;
	
	public UserInput(String title, List<String> options, String ending) {
		this.title = title;
		this.options = options;
		this.ending = ending;
		scanner = new Scanner(System.in);
	}
	
	public int getUserInput() {
		while(true) {
			System.out.println(title);
			for (String option: options) {
				System.out.println(option);
			}
			if(ending!=null) System.out.println(ending);
			
			return scanner.nextInt();
		}
	}
	
	
	
	
	
	
	
}
