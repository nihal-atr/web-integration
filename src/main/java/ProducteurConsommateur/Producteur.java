package ProducteurConsommateur;



public class Producteur extends Thread {

    private File file;

    public Producteur(File file, String nom) {
        super(nom);
        this.file = file;
    }

    @Override
    public void run() {
        int valeur = 0;

        while (true) {
            try {
                file.produire(valeur);
                valeur++;
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
