class calc extends Thread {
    public void run() {
        System.out.println("AKSHAY PANDEY");
        System.out.println("ELECTRONICS AND COMMUNICATION ENGINEERING");
    }
}

class message extends Thread {
    public void run() {
        System.out.println();
        try {
            System.out.println("KUSHINAGAR UTTAR PRADESH");
            System.out.println("GORAKHPUR SURAJKUND");
            Thread.sleep(2000); // TIME IN SECONDS
        } catch (Exception e) {
            System.out.println("SOME PROBLEMS");
        }

    }
}

public class D13march_3_making_of_multiple_threads_multithreading {
    public static void main(String[] args) {
        calc c = new calc();
        message m = new message();
        c.start();
        m.start();
    }
}
