package BinaryTreeThread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class TreeSizeCalculator implements Callable<Integer> {

    private final Node root;
    private final ExecutorService executor;

    public TreeSizeCalculator(Node root, ExecutorService executor) {
        this.root = root;
        this.executor = executor;
    }
    @Override
    public Integer call() throws Exception {
        if(root == null) {
            return 0;
        }

        Future<Integer> leftSizeFuture = null;
        Future<Integer> rightSizeFuture = null;
        if(root.left != null) {
            leftSizeFuture = executor.submit(new TreeSizeCalculator(root.left, executor));
        }
        if(root.left != null) {
            rightSizeFuture = executor.submit(new TreeSizeCalculator(root.right, executor));
        }

        int leftSize = (leftSizeFuture != null) ? leftSizeFuture.get(): 0;
        int rightSize = (rightSizeFuture != null) ? rightSizeFuture.get() :0;

        return 1 + leftSize + rightSize;
    }
}
