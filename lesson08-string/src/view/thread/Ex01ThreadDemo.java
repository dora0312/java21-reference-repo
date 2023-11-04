package view.thread;

import java.util.concurrent.TimeUnit;

public class Ex01ThreadDemo {
	public static void main(String[] args) {
		System.out.println("--- Start Main ---");
		
		Runnable taskA = new Runnable() {
			
			@Override
			public void run() {
				printCurrentThread(11);
				doTask();
			}
		};
		
		Thread t1 = new Thread(taskA, "Thread 1");
		t1.start();
		doTask(1);
		
		printCurrentThread(19);
		System.out.println("--- End Main ---");
	}
	private static void doTask(int seconds) {
		System.out.println("Load Data From File x.txt");
		try {
			TimeUnit.SECONDS.sleep(seconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private static void doTask() {
		System.out.println("Load Data From File x.txt");
	}
	private static void printCurrentThread(int id) {
		System.out.println("Current Thread(" + id + ") --> '" + Thread.currentThread().getName() + "'");
	}
}
