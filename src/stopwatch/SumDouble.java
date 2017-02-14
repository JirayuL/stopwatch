package stopwatch;

/**
 * Class for SumDouble create ARRAY_SIZE array of value.
 * 
 * @author Jirayu Laungwilawan
 * @version 1.2.17
 */
public class SumDouble implements Runnable {
	private final int ARRAY_SIZE = 500000;
	private double[] values = new double[ARRAY_SIZE];;
	Double sum = new Double(0.0);
	private int counter;

	/**
	 * Constructor for SumDouble set counter equal to user's counter and create
	 * array size ARRAY_SIZE from 1 to ARRAY_SIZE in value.
	 * 
	 * @param recive
	 *            counter from user and set this.counter equal to counter.
	 */
	public SumDouble(int counter) {
		this.counter = counter;
		for (int i = 0; i < ARRAY_SIZE; i++)
			values[i] = new Double(i + 1);
	}

	/**
	 * Summation of 1 to counter keep in sum.
	 */
	@Override
	public void run() {
		// count = loop counter, i = array index
		for (int count = 0, i = 0; count < counter; count++, i++) {
			if (i >= values.length)
				i = 0;
			sum = sum + values[i];
		}
	}

	/**
	 * Return how many time to sum and summation of array keep in sum.
	 */
	@Override
	public String toString() {
		return String.format("Sum array of Double objects with count = %,d\n", counter) + "sum = " + sum;
	}

}
