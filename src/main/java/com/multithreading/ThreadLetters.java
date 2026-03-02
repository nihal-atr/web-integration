package com.multithreading;

public class ThreadLetters extends Thread{
		public ThreadLetters() {super();}
		public ThreadLetters(String n) {super(n);}
		public void run() {
			for (char i ='a'; i <'z';i++) {
				System.out.println("le thread actuelle " + ThreadLetters.currentThread().getName() + "a l' etape "+i);
			}
		}
		
		
		
	

}
