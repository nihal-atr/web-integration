package Parallelism;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class RootTask implements Callable<List<String>> {

    private int debut;
    private int fin;

    public RootTask(int debut, int fin) {
        this.debut = debut;
        this.fin = fin;
    }

    @Override
    public List<String> call() {

        List<String> resultats = new ArrayList<>();

        for (int i = debut; i < fin; i++) {
            double racine = Math.sqrt(i);
            resultats.add("√" + i + " = " + racine);
        }

        return resultats;
    }
}
