import java.util.Scanner;

// Fibonacci class to generate Fibonacci numbers
class Fibonacci implements Runnable {
    private int limit;

    public Fibonacci(int limit) {
        this.limit = limit;
    }

    @Override
    public void run() {
        int first = 0, second = 1, next;

        System.out.println("Fibonacci Series up to " + limit + ":");
        System.out.print(first + " " + second + " ");

        while (true) {
            next = first + second;
            if (next > limit) {
                break;
            }
            System.out.print(next + " ");
            first = second;
            second = next;
        }
        System.out.println();
    }
}

// EvenNumbers class to display even numbers in a given range
class EvenNumbers implements Runnable {
    private int start, end;

    public EvenNumbers(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        System.out.println("Even numbers between " + start + " and " + end + ":");
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

public class fibo_even {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // User input for Fibonacci limit
        System.out.print("Enter the limit for Fibonacci series: ");
        int fibLimit = sc.nextInt();

        // User input for the range for even numbers
        System.out.print("Enter the start of the range for even numbers: ");
        int start = sc.nextInt();

        System.out.print("Enter the end of the range for even numbers: ");
        int end = sc.nextInt();

        // Create thread for Fibonacci number generation
        Fibonacci fibTask = new Fibonacci(fibLimit);
        Thread fibThread = new Thread(fibTask);

        // Create thread for even number display
        EvenNumbers evenTask = new EvenNumbers(start, end);
        Thread evenThread = new Thread(evenTask);

        // Start both threads
        fibThread.start();
        evenThread.start();

        try {
            // Wait for both threads to finish
            fibThread.join();
            evenThread.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }

        System.out.println("Both tasks completed.");
        sc.close();
    }
}
