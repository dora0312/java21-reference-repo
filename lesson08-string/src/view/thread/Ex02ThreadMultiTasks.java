package view.thread;

import java.util.concurrent.TimeUnit;

public class Ex02ThreadMultiTasks {
	static long start = 0;
	public static void main(String[] args) {
		System.out.println("--- Main Start ---");
		
		start = System.currentTimeMillis();
		
		Task taskA = new Task("Load data from table A", 4);
		//taskA.run();
		excuteTask(taskA, "thread-1");
		
		Task taskB = new Task("Load data from table B", 2);
		//taskB.run();
		excuteTask(taskB, "thread-2");
		
		Task taskC = new Task("Load data from table C", 5);
		//taskC.run();
		excuteTask(taskC, "thread-3");
		
		System.out.println("--- Main End ---");
	}
	
	private static void excuteTask(Runnable runnable, String threadName) {
		Thread thread =  new Thread(runnable, threadName);
		thread.start();
	}
	
	/*
	  Giải lập task:
	    +) Tên task
	    +) Thời gian thực thi
	 */
	private static class Task implements Runnable {
		private static String name;
		private static int seconds;
		public Task(String name, int seconds) {
			this.name = name;
			this.seconds = seconds;
		}
		@Override
		public void run() {
			String threadName = Thread.currentThread().getName();
			System.out.println("\n<<<<Thread " + threadName + " started executing Task " + name + "....");
			doTask(seconds);
			System.out.println("Thread " + threadName + " started executing Task " + name + ">>>");
			
			System.out.println(name + " took-->" + (System.currentTimeMillis() - start) + "(ms)");
		}
	}
	private static void doTask(int seconds) {
		try {
			for(int i = 1; i <= seconds; i++) {
				TimeUnit.SECONDS.sleep(1);
				System.out.println(Thread.currentThread().getName() + " executes " + i + "s");
			}
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
