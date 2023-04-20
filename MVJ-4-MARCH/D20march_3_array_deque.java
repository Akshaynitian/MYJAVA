import java.util.ArrayDeque;

public class D20march_3_array_deque {
    public static void main(String[] args) {
        ArrayDeque ad = new ArrayDeque<>();
        ad.add(100);
        ad.add(200);
        ad.add(300);
        System.out.println(ad);
        ad.addFirst(10);
        ad.addLast("akshay");
        System.out.println(ad);
        ad.add(200);
        System.out.println(ad);
        ad.offer(500);
        ad.offerFirst("pandey");
        ad.offerLast("pw");
        System.out.println(ad);
    }
}
