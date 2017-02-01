package stopwatch;

public class TaskTimer {

	private Stopwatch timer;
	
	public TaskTimer() {
		this.timer = new Stopwatch();
	}
	
	public void measureAndPrint(Runnable runnable){
		timer.start();
		runnable.run();
		System.out.println(runnable.toString());
		timer.stop();
		System.out.printf("Elapsed time %.6f sec\n\n", timer.getElapsed());
	}

}
