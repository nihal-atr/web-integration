package ProducteurConsommateur;



public class Main {
	

    public static void main(String[] args) {
 

        File file = new File(5); 

        Producteur p1 = new Producteur(file, "Producteur1");
        Producteur p2 = new Producteur(file, "Producteur2");

        Consommateur c1 = new Consommateur(file, "Consommateur1");
        Consommateur c2 = new Consommateur(file, "Consommateur2");

        p1.start();
        p2.start();
        c1.start();
        c2.start();
    }
}
