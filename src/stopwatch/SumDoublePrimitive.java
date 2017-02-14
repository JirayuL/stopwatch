package stopwatch;

/**
 * Class for SumDoublePrimitive create ARRAY_SIZE array of value.
 * 
 * @author Jirayu Laungwilawan
 * @version 1.2.17
 */
public class SumDoublePrimitive implements Runnable {
	private final int ARRAY_SIZE = 500000;
	private double[] values = new double[ARRAY_SIZE];;
	double sum = 0.0;
	private int counter;

	/**
	 * Constructor for SumDoublePrimitive set counter equal to user'a counter
	 * and create array size ARRAY_SIZE from 1 to ARRAY_SIZE in value.
	 * 
	 * @param recive
	 *            counter from user and set this.counter equal to counter.
	 */
	public SumDoublePrimitive(int counter) {
		this.counter = counter;
		for (int k = 0; k < ARRAY_SIZE; k++)
			values[k] = k + 1;
	}

	/**
	 * Summation of 1 to counter keep in sum.
	 */
	@Override
	public void run() {
		// count = loop counter, i = array index value
		for (int count = 0, i = 0; count < counter; count++, i++) {
			if (i >= values.length)
				i = 0; // reuse the array when get to last value
			sum = sum + values[i];
		}
	}

	/**
	 * Return how many time to sum and summation of array keep in sum.
	 */
	@Override
	public String toString() {
		return String.format("Sum array of double primitives with count = %,d\n", counter) + "sum = " + sum;
	}

}
