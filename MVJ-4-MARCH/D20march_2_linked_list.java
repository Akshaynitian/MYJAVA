import java.util.LinkedList;

public class D20march_2_linked_list {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList<>();
        ll.add(100);
        ll.add(200);
        ll.add(300);
        ll.addFirst("akshay");
        ll.addLast("pandey");
        System.out.println(ll);
        System.out.println(ll.peek());
        System.out.println(ll);
        System.out.println(ll.poll());
        System.out.println(ll);
    }
}
