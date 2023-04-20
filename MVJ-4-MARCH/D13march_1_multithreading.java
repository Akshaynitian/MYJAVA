public class D13march_1_multithreading {
    public static void main(String[] args) {
        System.out.println("MAIN THREAD");
        System.out.println("BEFORE CHANGING");
        String name = Thread.currentThread().getName();
        System.out.println(name);
        System.out.println(Thread.currentThread().getPriority());
        System.out.println("--------------------------");

        System.out.println("AFTER CHANGING");
        Thread t = Thread.currentThread();
        t.setName("akshay");
        t.setPriority(1);

        String name2 = Thread.currentThread().getName();
        System.out.println(name2);
        System.out.println(Thread.currentThread().getPriority());
    }
}
