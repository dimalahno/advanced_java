package multi_threads;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class TestProducerConsumer {
    private final static BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);

    public static void main(String[] args) {

    }

    private static void produce() throws InterruptedException {
        Random random = new Random(100);

        while (true) {
            queue.put(random.nextInt());
        }
    }

    private static void consumer () throws InterruptedException {
        while (true) {
            queue.take();
        }
    }
}
