package Threads;


public class threadprint extends Thread {
    private Object object;

    public threadprint(Object object) {
        this.object = object;
    }

    public void run() {
        synchronized (object) {
            System.out.print(object);
            object.notify();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Object firstObject = "Hey, ";
        Object secondObject = "Whatsup!";

        threadprint firstThread = new threadprint(firstObject);
        threadprint secondThread = new threadprint(secondObject);

        synchronized (firstObject) {
            firstThread.start();
            firstObject.wait();
        }

        synchronized (secondObject) {
            secondThread.start();
            secondObject.wait();
        }
    }
}
