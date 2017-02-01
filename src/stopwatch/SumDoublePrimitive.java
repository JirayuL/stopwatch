package stopwatch;

public class SumDoublePrimitive implements Runnable {
	private final int ARRAY_SIZE = 500000;
	private double[] values = new double[ARRAY_SIZE];;
	double sum = 0.0;
	private int counter;

	public SumDoublePrimitive(int counter) {
		this.counter = counter;
		for (int k = 0; k < ARRAY_SIZE; k++)
			values[k] = k + 1;
	}

	@Override
	public void run() {
		// count = loop counter, i = array index value
		for (int count = 0, i = 0; count < counter; count++, i++) {
			if (i >= values.length)
				i = 0; // reuse the array when get to last value
			sum = sum + values[i];
		}
	}

	@Override
	public String toString() {
		return String.format("Sum array of double primitives with count = %,d\n", counter) + "sum = " + sum;
	}

}
