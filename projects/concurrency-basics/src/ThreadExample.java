public class ThreadExample extends Thread {

    public void run() {
        System.out.println("Thread running: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        new ThreadExample().start();
    }
}
// minor improvement 14
