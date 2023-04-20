class library implements Runnable {
    String res1 = new String("JAVA"); // these are the books
    String res2 = new String("SQL");
    String res3 = new String("DSA");

    public void run() {
        String name = Thread.currentThread().getName();
        if (name.equals("STUDENT 1")) {
            try {
                Thread.sleep(3000);
                synchronized (res1) {
                    System.out.println("stduent 1 has acquired the res1 " + res1);
                    Thread.sleep(3000);
                    synchronized (res2) {
                        System.out.println("stduent 1 has acquired the res2 " + res2);
                        Thread.sleep(3000);
                        synchronized (res3) {
                            System.out.println("stduent 1 has acquired the res1 " + res3);
                            Thread.sleep(3000);
                        }
                    }
                }
            } catch (Exception e) {
                System.out.println("some problem");
            }
        } else {
            try {
                Thread.sleep(3000);
                synchronized (res3) {
                    System.out.println("stduent 2 has acquired the res3 " + res3);
                    Thread.sleep(3000);
                    synchronized (res2) {
                        System.out.println("stduent 2 has acquired the res2 " + res2);
                        Thread.sleep(3000);
                        synchronized (res1) {
                            System.out.println("stduent 2 has acquired the res1 " + res1);
                            Thread.sleep(3000);
                        }
                    }
                }
            } catch (Exception e) {
                System.out.println("some problem");
            }

        }
    }
}

public class D13march_10_dead_lock {
    public static void main(String[] args) {
        library lib = new library();
        Thread t1 = new Thread(lib); // provides the address of library class
        Thread t2 = new Thread(lib);

        t1.setName("STUDENT 1");
        t2.setName("STUDENT 2");

        t1.start();
        t2.start();

    }
}
