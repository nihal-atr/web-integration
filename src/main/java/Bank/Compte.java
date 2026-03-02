package Bank;

public class Compte {
	private int solde  = 1000 ;
	
	public void retirer (int montant ) {
		solde -= montant ;  
	
		
	}
	public int getSolde() {
	    return solde;
	}
}
