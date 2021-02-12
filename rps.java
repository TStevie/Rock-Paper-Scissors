import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter R for Rock P for Paper S for Scissors or Q to Quit");
			String choice = scanner.nextLine();
			if (choice.equals("Q")) {
				System.out.println("Exiting Game, Bye!");
				break;
			} else if (!choice.equals("R") && !choice.equals("P") && !choice.equals("S")) {
				System.out.println("Invalid Input");
				break;
			}
			System.out.println("you chose; " + choice);
			
			Random rand = new Random();
			int upperbound = 3;
			int cpuChoice = rand.nextInt(upperbound);
			switch(cpuChoice) {
				case 0 :
					System.out.println("computer chose Rock");
					if (choice.equals("R")) {
						System.out.println("Tie");
					} else if (choice.equals("P")) {
						System.out.println("You Win");
					} else if (choice.equals("S")) {
						System.out.println("You Lose");
					}
				
					break;
				case 1 :
					System.out.println("computer chose Paper");
					if (choice.equals("R")) {
						System.out.println("You Lose");
					} else if (choice.equals("P")) {
						System.out.println("Tie");
					} else if (choice.equals("S")) {
						System.out.println("You Win");
					}
					break;
				case 2 :
					System.out.println("computer chose Scissors");
					if (choice.equals("R")) {
						System.out.println("You Win");
					} else if (choice.equals("P")) {
						System.out.println("You Lose");
					} else if (choice.equals("S")) {
						System.out.println("Tie");
					}
					break;
			}
		}
		
	}
}
