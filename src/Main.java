import concurrency.NumberPrint;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                    System.out.println("Task completed.");
                } catch (InterruptedException e) {
                    System.out.println("Thread interrupted while sleeping.");
                }
            }
        });


        thread.start();


        try {
            Thread.sleep(2000);
            thread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();

        }

//        ExecutorService executorService = Executors.newFixedThreadPool(10);
//        for(int i = 0; i <= 100; i++) {
//            System.out.println("DEBUG");
//            NumberPrint task = new NumberPrint(i);
//            executorService.execute(task);
//        }
//        executorService.shutdown();
    }
}

