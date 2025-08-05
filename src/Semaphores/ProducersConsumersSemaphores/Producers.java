package Semaphores.ProducersConsumersSemaphores;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producers implements  Runnable{

    private Queue<Object> store;
    private  int maxSize;
    private String name;
    private Semaphore producerSemaphore;
    private  Semaphore consumerSemaphore;

    public Producers(Queue<Object> store, int maxSize, String name, Semaphore producerSemaphore, Semaphore consumerSemaphore) {
        this.maxSize = maxSize;
        this.store = store;
        this.name = name;
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
    }

    @Override
    public void run() {
        while (true){
            try {
                producerSemaphore.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(this.name+ " Adding an element: "+ store.size());
            store.add(new Object());
            consumerSemaphore.release();
        }
    }
}
