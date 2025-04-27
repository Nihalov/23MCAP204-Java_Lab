// Shared Resource (Buffer)
class SharedBuffer {
    private int data;
    private boolean available = false;

    // Producer will call this method
    public synchronized void produce(int value) {
        // If data is already available, producer should wait
        while (available) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Producer interrupted.");
            }
        }
        data = value;
        available = true;
        System.out.println("Produced: " + data);
        notify(); // Notify consumer that data is available
    }

    // Consumer will call this method
    public synchronized int consume() {
        // If no data is available, consumer should wait
        while (!available) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Consumer interrupted.");
            }
        }
        available = false;
        System.out.println("Consumed: " + data);
        notify(); // Notify producer that space is available
        return data;
    }
}

// Producer Thread
class Producer extends Thread {
    private SharedBuffer buffer;

    public Producer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        int value = 0;
        while (value <= 5) {
            buffer.produce(value);
            value++;
            try {
                Thread.sleep(500); // Sleep to simulate time for production
            } catch (InterruptedException e) {
                System.out.println("Producer sleep interrupted.");
            }
        }
    }
}

// Consumer Thread
class Consumer extends Thread {
    private SharedBuffer buffer;

    public Consumer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        int value;
        do {
            value = buffer.consume();
            try {
                Thread.sleep(500); // Sleep to simulate time for consumption
            } catch (InterruptedException e) {
                System.out.println("Consumer sleep interrupted.");
            }
        } while (value < 5);
    }
}

// Main Class
public class producer {
    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer();

        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

        producer.start();
        consumer.start();
    }
}
