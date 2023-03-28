package src;

public class TheThread extends Thread{

	public void run() {
		int i = 100;
		while(i-- > 0) {
			System.out.println("Thread running");
			
		}
	}
}
