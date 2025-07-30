package BinaryTreeThread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        ExecutorService executorService = Executors.newCachedThreadPool();
        TreeSizeCalculator calculator = new TreeSizeCalculator(root, executorService);

        Future<Integer> futureSize = executorService.submit(calculator);
        int size = futureSize.get();
        System.out.println(size);
        executorService.shutdown();
    }
}
