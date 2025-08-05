package Semaphores.ProducersConsumers;

import java.util.Queue;

public class Consumers implements Runnable {

    private Queue<Object> store;
    private  int maxSize;
    private String name;

    public Consumers(Queue<Object> store, int maxSize, String  name) {
        this.store = store;
        this.maxSize = maxSize;
        this.name = name;
    }

    public void run(){

        while (true){
            synchronized (store){
                if(!store.isEmpty()) {
                    System.out.println(this.name+ " Removing an element: "+ store.size());
                    store.remove();
                }
            }

        }

    }
}
