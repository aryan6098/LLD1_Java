package Semaphores.ProducersConsumersSemaphores;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.Semaphore;

public class Client {

    public static void main(String[] args) {
        Queue<Object> store = new ConcurrentLinkedDeque<>();

        Semaphore producersSemaphores = new Semaphore(6);
        Semaphore consumerSemaphores = new Semaphore(0);


        Producers p1 = new Producers(store, 6, "p1", producersSemaphores, consumerSemaphores);
        Producers p2 = new Producers(store, 6, "p2", producersSemaphores, consumerSemaphores);
        Producers p3 = new Producers(store, 6, "p3", producersSemaphores, consumerSemaphores);

        Consumers c1 = new Consumers(store, 6, "c1", consumerSemaphores, producersSemaphores);
        Consumers c2 = new Consumers(store, 6, "c2", consumerSemaphores, producersSemaphores);
        Consumers c3 = new Consumers(store, 6, "c3", consumerSemaphores, producersSemaphores);
        Consumers c4 = new Consumers(store, 6, "c4", consumerSemaphores, producersSemaphores);
        Consumers c5 = new Consumers(store, 6, "c5", consumerSemaphores, producersSemaphores);

        Thread t1 = new Thread(p1);
        t1.start();
        Thread t2 = new Thread(p2);
        t2.start();
        Thread t3 = new Thread(p3);
        t3.start();

        Thread t4 = new Thread(c1);
        t4.start();
        Thread t5 = new Thread(c2);
        t5.start();
        Thread t6 = new Thread(c3);
        t6.start();
        Thread t7 = new Thread(c4);
        t7.start();
        Thread t8 = new Thread(c5);
        t8.start();

    }


}
