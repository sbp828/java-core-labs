public class ThreadExample extends Thread {

    public void run() {
        System.out.println("Thread running: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        new ThreadExample().start();
    }
}
// minor improvement 14
// minor improvement 15
// minor improvement 23
// minor improvement 24
// minor improvement 25
// minor improvement 26
// minor improvement 39
// minor improvement 40
