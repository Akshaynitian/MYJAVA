import java.util.Scanner;
class calc implements Runnable {
    public void run() {
        System.out.println("AKSHAY PANDEY");
        System.out.println("ELECTRONICS AND COMMUNICATION ENGINEERING");
        Scanner scan = new Scanner(System.in);
        System.out.print("FIRST NUMBER ");
        int num1 = scan.nextInt();
        System.out.println();
        System.out.print("SECOND NUMBER");
        int num2 = scan.nextInt();
    }
}
class message implements Runnable {
    public void run() {
        System.out.println();
        System.out.println("KUSHINAGAR UTTAR PRADESH");
        System.out.println("GORAKHPUR SURAJKUND");
    }
}
public class D13march_4_making_of_multiple_threads_multithreading {
    public static void main(String[] args) {
        calc c = new calc();
        message m = new message();
        Thread t1 = new Thread(c);
        Thread t2 = new Thread(m);
        t1.start();
        t2.start();
    }
}
