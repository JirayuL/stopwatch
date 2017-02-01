package stopwatch;

import java.math.BigDecimal;
/**
 * Class for SumBigDecimal create array of value and add 
 * @author Jirayu Laungwilawan
 * @version 1.2.17
 */
public class SumBigDecimal implements Runnable{
	private final int ARRAY_SIZE = 500000;
	private BigDecimal[] values = new BigDecimal[ARRAY_SIZE];
	BigDecimal sum = new BigDecimal(0.0);
	private int counter;

	public SumBigDecimal(int counter) {
		this.counter = counter;
		for (int i = 0; i < ARRAY_SIZE; i++)
			values[i] = new BigDecimal(i + 1);
	}
	
	@Override
	public void run() {
		for (int count = 0, i = 0; count < counter; count++, i++) {
			if (i >= values.length)
				i = 0;
			sum = sum.add(values[i]);
		}
	}
	
	@Override
	public String toString() {
		return String.format("Sum array of BigDecimal with count = %,d\n", counter) + "sum = " + sum;
	}
}
