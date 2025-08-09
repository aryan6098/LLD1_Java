package lambdasAndStreams.AdderSubstractor;

public class AdderSusbstractor {

    public static void main(String[] args) throws InterruptedException {

        Count count = new Count();
        System.out.println(count.value);
//        Runnable adderLambda = () -> {
//            for(int i = 0; i <= 10000; i++) {
//                synchronized (count) {
//                    count.value += i;
//                }
//            }
//        };

//        Runnable substractorLambda = () -> {
//            for(int i = 0; i<= 10000; i++){
//                synchronized (count) {
//                    count.value -= i;
//                }
//            }
//        };

        Thread t1 = new Thread(() -> {
            for(int i = 0; i <= 10000; i++) {
                synchronized (count) {
                    count.value += i;
                }
            }
        });
        Thread t2 = new Thread(() -> {
            for(int i = 0; i<= 10000; i++){
                synchronized (count) {
                    count.value -= i;
                }
            }
        });

        t1.start();
        t2.start();

        System.out.println("DEBUG");
        t1.join();
        t2.join();

        System.out.println(count.value);
    }
}
