package Multiple_Thread;

public class OurThread extends Thread {
	
	private String threadName;
	private int StartingPoint;
	private int counter;
	private int adder;
	private int timeDeference;
	private boolean threadStopingFlag;
	
	
	
	public OurThread(String threadName, int startingPoint, int adder, int timeDeference,
			boolean threadStopingFlag) {
		super();
		this.threadName = threadName;
		StartingPoint = startingPoint;
		this.adder = adder;
		this.timeDeference = timeDeference;
		this.threadStopingFlag = threadStopingFlag;
	}

	public void run() {
		counter = StartingPoint;
		while (threadStopingFlag) {
			counter += adder;
			try {
				
				sleep(timeDeference);
				
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
	
	public void threadStop() {
		threadStopingFlag = false;
	}
	
	

	public String getThreadName() {
		return threadName;
	}

	public void setThreadName(String threadName) {
		this.threadName = threadName;
	}

	public int getStartingPoint() {
		return StartingPoint;
	}

	public void setStartingPoint(int startingPoint) {
		StartingPoint = startingPoint;
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public int getAdder() {
		return adder;
	}

	public void setAdder(int adder) {
		this.adder = adder;
	}

	public int getTimeDeference() {
		return timeDeference;
	}

	public void setTimeDeference(int timeDeference) {
		this.timeDeference = timeDeference;
	}

	public boolean isThreadStopingFlag() {
		return threadStopingFlag;
	}

	public void setThreadStopingFlag(boolean threadStopingFlag) {
		this.threadStopingFlag = threadStopingFlag;
	}
	
	
	
}
