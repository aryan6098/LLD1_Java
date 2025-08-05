package Semaphores.ProducersConsumers;

import java.util.Objects;
import java.util.Queue;

public class Producers implements  Runnable{

    private Queue<Object> store;
    private  int maxSize;
    private String name;

    public Producers(Queue<Object> store, int maxSize, String name) {
        this.maxSize = maxSize;
        this.store = store;
        this.name = name;
    }

    @Override
    public void run() {
        while (true){
           synchronized (store){
               if(store.size() < maxSize)
               {
                   System.out.println(this.name+ " Adding an element: "+ store.size());
                   store.add(new Object());
               }
           }
        }
    }
}
