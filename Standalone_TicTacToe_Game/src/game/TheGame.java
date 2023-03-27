package game;

import ui.MainFrame;
import java.util.Scanner;

public class TheGame {
	// The game, this is where the magic happens...
	private static Scanner scan;
	private static int whoStarts; // 1 = X, 2 = O

	public static void main(String[] args) {
	    scan = new Scanner(System.in);
		getFirstPlayer();
		
		new MainFrame(whoStarts);
		// Closing Scanner after the use
        scan.close();
	}
	
	// Gets the first played X or O
	
	// !!! check alpha characters
	private static void getFirstPlayer() {
		try {
			System.out.println("Who is first: ");
			System.out.println("1. X");
			System.out.println("2. O");

			// This method reads the number provided using keyboard
			whoStarts = scan.nextInt();
        
			
		}catch(Exception e) {
			whoStarts = 3;
		}finally {
			if(whoStarts != 1 && whoStarts != 2) {
				System.out.println("Please enter either \"0\" or \"1\"");
				getFirstPlayer();
			}
		}		
	}
}
