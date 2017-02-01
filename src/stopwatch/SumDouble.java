package stopwatch;

public class SumDouble implements Runnable {
	private final int ARRAY_SIZE = 500000;
	private double[] values = new double[ARRAY_SIZE];;
	Double sum = new Double(0.0);
	private int counter;

	public SumDouble(int counter) {
		this.counter = counter;
		for (int i = 0; i < ARRAY_SIZE; i++)
			values[i] = new Double(i + 1);
	}
	
	@Override
	public void run() {
		// count = loop counter, i = array index
		for (int count = 0, i = 0; count < counter; count++, i++) {
			if (i >= values.length)
				i = 0;
			sum = sum + values[i];
		}
	}
	
	@Override
	public String toString() {
		return String.format("Sum array of Double objects with count = %,d\n", counter) + "sum = " + sum;
	}

}
