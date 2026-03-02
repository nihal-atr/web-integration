package Bank;

public class Main {
	public static void main (String[] args) {
		Compte account = new Compte();
		JobAhmedEtFatima retrait = new JobAhmedEtFatima(account);
		Thread Ahmed = new Thread(retrait, "Ahmed");
		Thread Fatima = new Thread(retrait, "Fatima");
		Ahmed.start();
		Fatima.start();
	}

}
