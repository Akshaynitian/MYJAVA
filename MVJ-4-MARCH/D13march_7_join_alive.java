class Printing implements Runnable {
    public void run() {
        try {
            for (int i = 0; i < 2; i++) {
                System.out.println("focus is important");
                Thread.sleep(3000);
            }
        } catch (Exception e) {
            System.out.println("some problem");
        }
    }
}

public class D13march_7_join_alive {
    public static void main(String[] args) throws Exception {
        System.out.println("main thread started");
        Printing p = new Printing();
        Thread t1 = new Thread(p);
        System.out.println(t1.isAlive()); // till here thread has no life false
        t1.start();
        System.out.println(t1.isAlive());// and now thread has life true
        t1.join();
        System.out.println("main thread finished the work");

    }
}
