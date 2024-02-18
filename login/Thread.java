import java.lang.Thread;
import java.lang.ClassNotFoundException;

class MultithreadingDemo extends Thread {
    public void run() {
        try {
            System.out.println("Thread" + Thread.currentThread().getName() + "is running");
        } catch (Exception e) {
            System.out.println("Exception is caught");
        }
    }
}

class Murali {
    public static void main(String args[]) {
        int n = 8;
        for (int i = 0; i < n; i++) {
            MultithreadingDemo obj = new MultithreadingDemo();
            obj.start();
        }
    }
}