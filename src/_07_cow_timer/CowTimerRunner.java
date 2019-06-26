package _07_cow_timer;

public class CowTimerRunner {
	public static void main(String[] args) throws InterruptedException {
		/* Make a CowTimer, set its time and start it.
		 * Use a short delay (seconds) when testing, then try with longer delays */
		CowTimer cow_timer = new CowTimer(4);
		cow_timer.setTime(5);
		cow_timer.start();
		

	}
}
