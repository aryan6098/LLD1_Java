package Semaphores.ProducersConsumersSemaphores;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Consumers implements Runnable {

    private Queue<Object> store;
    private  int maxSize;
    private String name;
    private Semaphore consumerSemaphore;
    private  Semaphore producerSemaphore;

    public Consumers(Queue<Object> store, int maxSize, String  name, Semaphore consumerSemaphore, Semaphore producerSemaphore) {
        this.store = store;
        this.maxSize = maxSize;
        this.name = name;
        this.consumerSemaphore = consumerSemaphore;
        this.producerSemaphore = producerSemaphore;
    }

    public void run(){

        while (true){
            try {
                consumerSemaphore.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(this.name+ " Removing an element: "+ store.size());
            store.remove();
            producerSemaphore.release();
        }

    }
}
