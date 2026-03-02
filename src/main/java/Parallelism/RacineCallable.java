package Parallelism;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class RacineCallable {

    public static void main(String[] args) throws Exception {

        long start = System.currentTimeMillis();

        ExecutorService executor = Executors.newFixedThreadPool(5);

        List<Future<List<String>>> futures = new ArrayList<>();

        int intervalle = 100;

        for (int i = 0; i <= 5000; i += intervalle) {

            int debut = i;
            int fin = Math.min(i + intervalle, 5000);

            futures.add(executor.submit(new RootTask(debut, fin)));
        }


        for (Future<List<String>> future : futures) {
            List<String> resultats = future.get();
            for (String s : resultats) {
                System.out.println(s);
            }
        }

        executor.shutdown();

        long end = System.currentTimeMillis();
        System.out.println("Temps Callable : " + (end - start) + " ms");
    }
}
