import java.util.LinkedList;

// Shared Buffer class
class Buffer {

    private final int capacity = 5;
    private final LinkedList<Integer> queue = new LinkedList<>();

    // Producer method
    public synchronized void produce(int value) throws InterruptedException {

        while (queue.size() == capacity) {
            wait();
        }

        queue.add(value);
        System.out.println("Produced: " + value);

        notifyAll();
    }

    // Consumer method
    public synchronized void consume() throws InterruptedException {

        while (queue.isEmpty()) {
            wait();
        }

        int value = queue.removeFirst();
        System.out.println("Consumed: " + value);

        notifyAll();
    }
}

// Producer thread
class Producer extends Thread {

    Buffer buffer;

    Producer(Buffer b) {
        buffer = b;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                buffer.produce(i);
                Thread.sleep(200);
            } catch (InterruptedException e) {
                // handle exception
            }
        }
    }
}

// Consumer thread
class Consumer extends Thread {

    Buffer buffer;

    Consumer(Buffer b) {
        buffer = b;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                buffer.consume();
                Thread.sleep(300);
            } catch (InterruptedException e) {
                // handle exception
            }
        }
    }
}

// Main class
public class p7 {

    public static void main(String[] args) {

        Buffer b = new Buffer();

        Producer p = new Producer(b);
        Consumer c = new Consumer(b);

        p.start();
        c.start();
    }
}
    