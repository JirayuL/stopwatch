package stopwatch;

/**
 * Class for Append char to String
 * 
 * @author Jirayu Laungwilawan
 * @version 1.2.17
 */
public class AppendToString implements Runnable {
	private int count;
	private final char CHAR = 'a';
	private String result = "";

	/**
	 * Constructor for AppendToString and set count equal to user's count.
	 * 
	 * @param recive
	 *            count from the user's input
	 */
	public AppendToString(int count) {
		this.count = count;
	}

	/**
	 * Adding CHAR to result count times.
	 */
	@Override
	public void run() {
		int k = 0;
		while (k++ < count) {
			result = result + CHAR;
		}

	}

	/**
	 * Return how many chars append to String.
	 */
	@Override
	public String toString() {
		return String.format("Append %,d chars to String\n", count) + "final string length = " + result.length();
	}

}
