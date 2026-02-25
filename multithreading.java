package lab5;

class MyRunnable implements Runnable {
    String name;

    MyRunnable(String name) {
        this.name = name;
    }

    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println(name + " - Count: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(name + " interrupted");
            }
        }
        System.out.println(name + " finished");
    }
}

public class multithreading {
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(new MyRunnable("Thread-1"));
        Thread t2 = new Thread(new MyRunnable("Thread-2"));

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Main thread finished");
    }
}