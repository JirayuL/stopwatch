package stopwatch;

import java.math.BigDecimal;

/**
 * Class for SumBigDecimal create ARRAY_SIZE array of value.
 * 
 * @author Jirayu Laungwilawan
 * @version 1.2.17
 */
public class SumBigDecimal implements Runnable {
	/** Constant for creating array. */
	private final int ARRAY_SIZE = 500000;
	private BigDecimal[] values = new BigDecimal[ARRAY_SIZE];
	BigDecimal sum = new BigDecimal(0.0);
	private int counter;

	/**
	 * Constructor for SumBigDecimal set counter equal to user's counter and
	 * create array size ARRAY_SIZE from 1 to ARRAY_SIZE in value.
	 * 
	 * @param recive
	 *            counter from user and set this.counter equal to counter.
	 */
	public SumBigDecimal(int counter) {
		this.counter = counter;
		for (int i = 0; i < ARRAY_SIZE; i++)
			values[i] = new BigDecimal(i + 1);
	}

	/**
	 * Summation of 1 to counter keep in sum.
	 */
	@Override
	public void run() {
		for (int count = 0, i = 0; count < counter; count++, i++) {
			if (i >= values.length)
				i = 0;
			sum = sum.add(values[i]);
		}
	}

	/**
	 * Return how many time to sum and summation of array keep in sum.
	 */
	@Override
	public String toString() {
		return String.format("Sum array of BigDecimal with count = %,d\n", counter) + "sum = " + sum;
	}
}
