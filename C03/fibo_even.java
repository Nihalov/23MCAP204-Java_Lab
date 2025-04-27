import java.util.Scanner;

// Class to generate Fibonacci numbers
class FibonacciThread extends Thread {
    private int count;

    public FibonacciThread(int count) {
        this.count = count;
    }

    @Override
    public void run() {
        int n1 = 0, n2 = 1;
        System.out.println("\nFibonacci Series up to " + count + " terms:");
        for (int i = 1; i <= count; i++) {
            System.out.print(n1 + " ");
            int next = n1 + n2;
            n1 = n2;
            n2 = next;
        }
        System.out.println("\nFibonacci Thread finished.\n");
    }
}

// Class to display even numbers in a range
class EvenNumberThread extends Thread {
    private int start, end;

    public EvenNumberThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        System.out.println("\nEven Numbers from " + start + " to " + end + ":");
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\nEven Number Thread finished.\n");
    }
}

// Main class to run the threads
public class fibo_even {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Fibonacci
        System.out.print("Enter how many Fibonacci numbers to generate: ");
        int fibCount = scanner.nextInt();

        // Input for Even numbers
        System.out.print("Enter start of range for even numbers: ");
        int startRange = scanner.nextInt();

        System.out.print("Enter end of range for even numbers: ");
        int endRange = scanner.nextInt();

        // Create thread objects
        FibonacciThread fibThread = new FibonacciThread(fibCount);
        EvenNumberThread evenThread = new EvenNumberThread(startRange, endRange);

        // Start threads
        fibThread.start();
        evenThread.start();

        scanner.close();
    }
}
