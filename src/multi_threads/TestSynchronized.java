package multi_threads;

public class TestSynchronized {
    private int counter;

    public static void main(String[] args) throws InterruptedException {
        TestSynchronized test = new TestSynchronized();
        test.doWork();
    }

    public void doWork() throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
//                counter++;
                increment();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(counter);
    }

    private synchronized void increment() {
        counter++;
    }
}
