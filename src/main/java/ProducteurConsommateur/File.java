package ProducteurConsommateur;

import java.util.LinkedList;

public class File {
	  private LinkedList<Integer> queue = new LinkedList<>();
	    private int capacite;

	    public File(int capacite) {
	        this.capacite = capacite;
	    }

	    public synchronized void produire(int valeur) throws InterruptedException {

	        while (queue.size() == capacite) {
	            System.out.println("File pleine . Producteur attend");
	            wait();
	        }

	        queue.add(valeur);
	        System.out.println("Produit ajouté : " + valeur);

	        notifyAll();
	    }

	    public synchronized int consommer() throws InterruptedException {

	        while (queue.isEmpty()) {
	            System.out.println("File vide . Consommateur attend");
	            wait();
	        }

	        int valeur = queue.removeFirst();
	        System.out.println("Produit consommé : " + valeur);

	        notifyAll();

	        return valeur;
	    }
}
