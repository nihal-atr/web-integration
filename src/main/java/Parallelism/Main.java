package Parallelism;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
	public Main() {
		//sequentielle();
		RacineParalleleRunnable();
	}
	public void sequentielle() {
		 long start = System.currentTimeMillis();

	        for (int i = 0; i <= 5000; i++) {
	            double racine = Math.sqrt(i);
	            System.out.println("√" + i + " = " + racine);
	        }

	        long end = System.currentTimeMillis();

	        System.out.println("Temps d'exécution : " + (end - start) + " ms");
	    }


	public void RacineParalleleRunnable() {

	        long start = System.currentTimeMillis();

	        ExecutorService executor = Executors.newFixedThreadPool(5);

	        int intervalle = 100;

	        for (int i = 0; i <= 5000; i += intervalle) {

	            int debut = i;
	            int fin = Math.min(i + intervalle, 5000);

	            executor.execute(new Runnable() {
	                @Override
	                public void run() {
	                    for (int j = debut; j < fin; j++) {
	                        double racine = Math.sqrt(j);
	                        System.out.println(Thread.currentThread().getName()
	                                + " √" + j + " = " + racine);
	                    }
	                }
	            });
	        }

	        executor.shutdown();

	        long end = System.currentTimeMillis();
	        System.out.println("Temps Runnable : " + (end - start) + " ms");
	    }
	public static void main(String[] args) {
		new Main();
	}
	
}
	

