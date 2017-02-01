package stopwatch;

/**
 * Class for Main class to show result of every action.
 * 
 * @author Jirayu Laungwilawan
 * @version 1.2.17
 */
public class Main {
	/**
	 * Create and run task.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int counter = 1000000000;
		TaskTimer task = new TaskTimer();
		task.measureAndPrint(new AppendToString(50000));
		task.measureAndPrint(new AppendToString(100000));
		task.measureAndPrint(new AppendToStringBuilder(100000));
		task.measureAndPrint(new SumDoublePrimitive(counter));
		task.measureAndPrint(new SumDouble(counter));
		task.measureAndPrint(new SumBigDecimal(counter));
	}

}
