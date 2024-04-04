package multi_thread;

public class Main {
	    static int[] arr = {1, 20, 50, 15, 30};
	    static double averageResult;
	    static boolean isAverageCalculated = false;

	    public static void main(String[] args) {
	        Object lock = new Object();

	        Thread thread1 = new Thread(() -> {
	            synchronized (lock) {
	                averageResult = calculateAverage();
	                isAverageCalculated = true;
	                lock.notify();
	            }
	        });

	        Thread thread2 = new Thread(() -> {
	            synchronized (lock) {
	                try {
	                    if (!isAverageCalculated)
	                        lock.wait();
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	                printSquares();
	            }
	        });

	        thread1.start();
	        thread2.start();

	        try {
	            thread1.join();
	            thread2.join();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        System.out.println("Both threads executed one by one.");
	    }

	    static double calculateAverage() {
	        int sum = 0;
	        for (int i = 1; i <= 10; i++) {
	            sum += i;
	        }
	        System.out.println("Average="+sum/10);
	        return (double) sum / 10;
	    }

	    static void printSquares() {
	        System.out.println("Squares of numbers:");
	        for (int num : arr) {
	            System.out.println(num * num);
	        }
	    }
	}

