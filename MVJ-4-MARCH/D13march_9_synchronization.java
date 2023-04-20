class car implements Runnable {
    public void run() { // synchronized public void run()
        try {
            System.out.println(Thread.currentThread().getName() + "has entered the parking lot");
            Thread.sleep(2000);
            synchronized (this) {
                System.out.println(Thread.currentThread().getName() + "got into car to drive");
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + "started to drive the car");
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + "come back and parked the car");
            }
        } catch (Exception e) {
            System.out.println("some problem");
        }
    }
}

public class D13march_9_synchronization {
    public static void main(String[] args) throws Exception { // throws Exception
        car c = new car();
        Thread t1 = new Thread(c);
        Thread t2 = new Thread(c);
        Thread t3 = new Thread(c);

        t1.setName("son 1");
        t2.setName("son 2");
        t3.setName("son 3");

        t1.start();
        t1.join();
        t2.start();
        t3.start();

    }
}
