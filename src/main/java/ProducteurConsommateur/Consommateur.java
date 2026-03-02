package ProducteurConsommateur;


public class Consommateur extends Thread {

    private File file;

    public Consommateur(File file, String nom) {
        super(nom);
        this.file = file;
    }


	@Override
    public void run() {
        while (true) {
            try {
                file.consommer();
                Thread.sleep(800);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
