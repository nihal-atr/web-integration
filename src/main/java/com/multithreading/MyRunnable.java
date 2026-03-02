package com.multithreading;

public class MyRunnable implements Runnable{
	@Override
    public void run() {
		String threadName = Thread.currentThread().getName();

		if (threadName == "t2") {
		for (char i ='a'; i <'z';i++) {
			System.out.println("le thread actuelle "+ threadName + "a l'etape " +i);
		}
		
		}
		else if (threadName == "t1") {
			for (int i =1; i < 10 ;i++) {
				System.out.println("le thread actuelle  " + threadName + "a l'etape " +i);
			}
		}
		
	
    }
	

}
