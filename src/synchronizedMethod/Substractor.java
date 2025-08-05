package synchronizedMethod;

public class Substractor implements Runnable {

    private Count count;

    public Substractor(Count count) {
        this.count = count;
    }

    public void run() {
        for(int i = 0; i <= 1000; i++) {
                count.incrementValue(-i);
        }
    }
}
