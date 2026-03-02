package com.multithreading;

public class ThreadNumbers extends Thread{

		public ThreadNumbers() {super();}
		public ThreadNumbers(String n) {super(n);}
		public void run() {
			for (int i =1; i < 10 ;i++) {
				System.out.println("le thread actuelle " +  ThreadNumbers.currentThread().getName()+ "a l'etape " + i);
			}
		}
		
		
		


}
