package com.multithreading;

public class Main {
	public Main() {
		withRunnable();
		 // currentJob();
		// sequentielJob();
		
	}
	public  void sequentielJob() {
		for (int i=0;i<10;i++) {
			System.out.println("on est a l'etape :"+i);
		}
		for (char c ='a' ; c<'z' ; c++) {
			System.out.println("la lettre actuelle : "+c);
		}
	}
	public void currentJob () {
		ThreadLetters t1 = new ThreadLetters("t1");
		Thread t2 = new ThreadNumbers("t2");
		//t1.setPriority(Thread.MAX_PRIORITY);
		//t2.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		t2.start();
		
	}
	public void withRunnable() {
		MyRunnable r = new MyRunnable();
		Thread t1 = new Thread(r,"t1");
		Thread t2 = new Thread(r,"t2");
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Affichage terminee");
		
		
		
		
	}
	public static void main(String[] args) {
		new Main();
	}
		
	
	
		
		
	

}

