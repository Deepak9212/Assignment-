package Threads;

public class Evenoddthreads {
	    public static void main(String[] args) {
	        Object lock = new Object(); // Create a shared lock object

	        // Create and start the even number thread
	        new Thread(() -> {
	            for (int i = 2; i <= 100; i += 2) {
	                System.out.println(i);
	            }
	            synchronized (lock) {
	                lock.notify(); // Notify the lock object to wake up the waiting thread
	            }
	        }).start();

	        // Create and start the odd number thread
	        new Thread(() -> {
	            synchronized (lock) {
	                try {
	                    lock.wait(); // Wait until notified by the even thread
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	            }
	            for (int i = 1; i <= 100; i += 2) {
	                System.out.println(i);
	            }
	        }).start();
	    }
	}

	

