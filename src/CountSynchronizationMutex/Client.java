package CountSynchronizationMutex;

public class Client {

    public static void main(String[] args) {
        Counter counter = new Counter(0);

        Thread incrementThread = new Thread(() -> {
           for(int i = 0; i < 1000; i++) {
               counter.incValue(1);
           }
        });

       Thread decrementThread = new Thread(() -> {
           for(int i =0; i < 1000; i++) {
               counter.decValue(1);
           }
       });

       incrementThread.start();
       decrementThread.start();
       try {
           incrementThread.join();
           decrementThread.join();
       }
       catch (InterruptedException e) {
           e.printStackTrace();
       }

        System.out.println("Final count value: " + counter.getValue());

    }
}
