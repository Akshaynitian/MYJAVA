import java.lang.reflect.Executable;

import javax.sound.sampled.SourceDataLine;

class demo1 implements Runnable {
    public void run() {
        System.out.println("child thread executing");
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            System.out.println("some problem");
        }
        System.out.println("child thread task completed");
    }
}

public class D13march_6_different_states_of_thread {
    public static void main(String[] args) {
        System.out.println("main thread started ");
        demo1 d = new demo1();
        Thread t1 = new Thread(d);
        t1.start();
    }
}
