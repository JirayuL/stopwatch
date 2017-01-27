package stopwatch;

/**
 * A Stopwatch that measure elapsed time between a starting time and stopping
 * time, or until the present time.
 * 
 * @author Jirayu Laungwilawan
 * @version 27.1.17
 *
 */
public class Stopwatch {
	/** constant for converting nanoseconds to seconds. */
	private static final double NANOSECONDS = 1.0E-9;
	/** time that the stopwatch was started, in nanoseconds. */
	private long startTime;
	private long stoptTime;

	public Stopwatch() {

	}

	private double getElapsed() {
		if (this.startTime > this.stoptTime) {
			return (System.nanoTime() - this.startTime) * NANOSECONDS;
		} else {
			return (this.stoptTime - this.startTime) * NANOSECONDS;
		}
	}

	private boolean isRunning() {
		if (this.startTime > this.stoptTime) {
			return true;
		} else {
			return false;
		}
	}

	private void start() {
		this.startTime = System.nanoTime();
	}

	private void stop() {
		this.stoptTime = System.nanoTime();
	}

	public static void main(String[] args) {
		Stopwatch timer = new Stopwatch();
		System.out.println("Starting task");
		timer.start();
		// doSomething(); // do some work
		timer.stop(); // stop timing the work
		System.out.printf("elapsed = %.6f sec\n", timer.getElapsed());
		if (timer.isRunning())
			System.out.println("timer is still running!");
		else
			System.out.println("timer is stopped");
	}

}
