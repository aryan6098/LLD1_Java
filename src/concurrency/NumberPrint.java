package concurrency;

public class NumberPrint implements Runnable{
    private final int number;

    public NumberPrint(int number) {
        this.number = number;
    }
    @Override
    public void run() {
        System.out.println("Printing "+ number + " by thread: "+ Thread.currentThread().getName());
    }
}


/*
    FIXED SIZE THREAD POOL:
    WHEN TO USE THIS? -> Ideal for CPU-bound tasks -> Tasks where the no. of threads are close to the no. of CPU cores

    Printing numbers with a fixed pool
 */