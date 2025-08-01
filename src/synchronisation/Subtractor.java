package synchronisation;

import java.security.PrivateKey;
import java.util.concurrent.locks.Lock;

public class Subtractor implements  Runnable{
    private Count count;
    private Lock lock;

    public  Subtractor(Count count) {
        this.count = count;
        this.lock = lock;
    }

    @Override
    public void run() {
        for(int i = 1 ;i <= 100; i++) {
            count.value -= 1;
        }
    }
}
