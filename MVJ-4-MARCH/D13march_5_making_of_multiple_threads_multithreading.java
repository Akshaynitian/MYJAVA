import java.util.Scanner;

class mythread extends Thread {
    public void run() {
        String tname = Thread.currentThread().getName();
        if (tname.equals("calc")) {
            calc();
        } else {
            importantmsg();
        }
    }

    public void calc() {
        System.out.println("calculation task started");
        Scanner scan = new Scanner(System.in);
        System.out.print("FIRST NUMBER ");
        int num1 = scan.nextInt();
        System.out.println();
        System.out.print("SECOND NUMBER");
        int num2 = scan.nextInt();
        int res = num1 + num2;
        System.out.println(res);
        System.out.println("calculation task ended");
        System.out.println("*********************************");
    }

    public void importantmsg() {
        System.out.println("displaying important msg task");
        try {
            for (int i = 0; i < 3; i++) {
                System.out.println("focus is important to master skills");
                Thread.sleep(2000);
            }
        } catch (Exception e) {
            System.out.println("some problem");
        }
        System.out.println("displaying important msg task ended");
    }
}

public class D13march_5_making_of_multiple_threads_multithreading {
    public static void main(String[] args) {
        System.out.println("main thread started");
        mythread thread1 = new mythread();
        mythread thread2 = new mythread();
        thread1.setName("calc");
        thread2.setName("print");
        thread1.start();
        thread2.start();
    }
}
