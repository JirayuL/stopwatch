package stopwatch;

/**
 * Class for append char to StringBuilder
 * 
 * @author Jirayu Laungwilawan
 * @version 1.2.17
 */
public class AppendToStringBuilder implements Runnable {
	private int count;
	private final char CHAR = 'a';
	private String result = "";

	/**
	 * Constructor for AppendToStringBuilder and set count equal to user's
	 * count.
	 * 
	 * @param recive
	 *            count from the user's input
	 */
	public AppendToStringBuilder(int count) {
		this.count = count;
	}

	/**
	 * Adding CHAR to builder count times and set result equal to
	 * builder.toString().
	 */
	@Override
	public void run() {
		StringBuilder builder = new StringBuilder();
		int k = 0;
		while (k++ < count) {
			builder = builder.append(CHAR);
		}
		result = builder.toString();
	}

	/**
	 * Return how many chars append to StringBuilder.
	 */
	@Override
	public String toString() {
		return String.format("Append %,d chars to StringBuilder\n", count) + "final string length = " + result.length();
	}
}
