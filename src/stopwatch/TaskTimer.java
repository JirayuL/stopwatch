package stopwatch;
/**
 * Class for TaskTimer task management.
 * @author Jirayu Laungwilawan
 * @version 1.2.17
 */
public class TaskTimer {
	/**Initialize timer.*/
	private Stopwatch timer;
	/**
	 * Constructor for TaskTimer create new Stopwatch.
	 */
	public TaskTimer() {
		this.timer = new Stopwatch();
	}
	/**
	 * Receive task and run Stopwatch and print the elapsed time.
	 * @param recive which task will be run keep in runnable.
	 */
	public void measureAndPrint(Runnable runnable){
		timer.start();
		runnable.run();
		System.out.println(runnable.toString());
		timer.stop();
		System.out.printf("Elapsed time %.6f sec\n\n", timer.getElapsed());
	}

}
