class mythread extends Thread {
    public void run() {
        System.out.println("CHILD THREAD");
    }
}

public class D13march_2_multithreading {
    public static void main(String[] args) {
        System.out.println("MAIN THREAD");
        mythread obj = new mythread();
        obj.start();
    }
}
