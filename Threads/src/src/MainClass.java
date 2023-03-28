package src;

public class MainClass {

	public static void main(String[] args) {
		TheThread thread = new TheThread();
		thread.start();
		int i = 100;
		while(i-- > 0) {
			System.out.println("Printing from main");
		}
		
	}

}
