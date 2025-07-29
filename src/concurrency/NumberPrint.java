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
