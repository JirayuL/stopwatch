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

	/**
	 * Constructor for Stopwatch
	 */
	public Stopwatch() {
		this.startTime = 0;
		this.stoptTime = 0;
	}

	/**
	 * Check whether the Stopwatch is stopped or running and return the time
	 * when call this method.
	 * 
	 * @return time of Stopwatch when the user call this method.
	 */
	public double getElapsed() {
		if (this.startTime > this.stoptTime) {
			return (System.nanoTime() - this.startTime) * NANOSECONDS;
		} else {
			return (this.stoptTime - this.startTime) * NANOSECONDS;
		}
	}

	/**
	 * To check whether the Stopwatch is running or stopped and return the result.
	 * @return Is Stopwatch running or stopped?
	 */
	public boolean isRunning() {
		if (this.startTime > this.stoptTime) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * To get the time when the Stopwatch start.
	 */
	public void start() {
		this.startTime = System.nanoTime();
	}
	
	/**
	 * To get the time when the Stopwatch stop.
	 */
	public void stop() {
		this.stoptTime = System.nanoTime();
	}
	
	/**
	 * Do something like work or study.
	 */
	public static void doSomething() {
		System.out.println("Hard working!!!");
	}

	/**
	 * Main method to test the Stopwatch object.
	 * @param args
	 */
	public static void main(String[] args) {
		Stopwatch timer = new Stopwatch();
		System.out.println("Starting task");
		timer.start();
		doSomething(); // do some work
		timer.stop(); // stop timing the work
		System.out.printf("elapsed = %.6f sec\n", timer.getElapsed());
		if (timer.isRunning())
			System.out.println("timer is still running!");
		else
			System.out.println("timer is stopped");
	}

}
