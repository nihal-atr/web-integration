package Bank;

import java.util.concurrent.locks.ReentrantLock;

/*public class JobAhmedEtFatima implements Runnable{
	private ReentrantLock lock = new ReentrantLock();
	Compte compte ;
	public JobAhmedEtFatima(Compte compte) {
		this.compte = compte ;
	}
	public void doRetrait (int montant) {
		try {
		if(montant <= compte.getSolde()) {
			
			
			Thread.sleep(200);
			System.out.println("Verification terminee ! ");
			
			compte.retirer(montant);
			
			System.out.println(Thread.currentThread().getName()+ "a retiree le montant suivant " + montant + "il vous reste " + compte.getSolde() );
			
		}else{System.out.println("solde insuffisant !");}}
		
		catch(InterruptedException e) {System.out.println(e);} }
		

		
		
	
	@Override
	public void run() {
		while(compte.getSolde() > 0) {
		doRetrait(10);
		}
		
	}
	

}*/


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class JobAhmedEtFatima implements Runnable {

    private Compte compte;
    private Lock lock = new ReentrantLock(); 

    public JobAhmedEtFatima(Compte compte) {
        this.compte = compte;
    }

    public void doRetrait(int montant) {

        lock.lock();  

        try {

            if (montant <= compte.getSolde()) {

                System.out.println(Thread.currentThread().getName() + 
                                   " veut retirer " + montant);

                Thread.sleep(200);

                compte.retirer(montant);

                System.out.println(Thread.currentThread().getName() +
                        " a retiré " + montant +
                        " | Solde restant : " + compte.getSolde());

            } else {
                System.out.println("Solde insuffisant !");
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();  
        }
    }

    @Override
    public void run() {
        while (compte.getSolde() > 0) {
            doRetrait(10);
        }
    }
}

