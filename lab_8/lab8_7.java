public class lab8_7 {
    private static final int BUFFER_SIZE = 5;
    private static final Object lock = new Object();
    private static int[] buffer = new int[BUFFER_SIZE];
    private static int count = 0;

    public static void main(String[] args) {
        Thread producerThread = new Thread(lab8_7::produce);
        Thread consumerThread = new Thread(lab8_7::consume);

        producerThread.start();
        consumerThread.start();
    }

    private static void produce() {
        try {
            synchronized (lock) {
                while (count == BUFFER_SIZE) {
                    System.out.println("Buffer is full. Producer waiting...");
                    lock.wait();
                }

                // Produce an item (e.g., increment count)
                buffer[count] = count;
                System.out.println("Produced: " + buffer[count]);
                count++;

                // Notify the consumer
                lock.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void consume() {
        try {
            synchronized (lock) {
                while (count == 0) {
                    System.out.println("Buffer is empty. Consumer waiting...");
                    lock.wait();
                }

                // Consume an item (e.g., decrement count)
                count--;
                System.out.println("Consumed: " + buffer[count]);

                // Notify the producer
                lock.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
