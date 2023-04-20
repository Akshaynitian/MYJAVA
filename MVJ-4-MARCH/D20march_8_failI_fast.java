import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.*;

public class D20march_8_failI_fast {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(100);
        al.add(200);
        al.add(300);
        System.out.println(al);

        // fail fast
        Iterator itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
            // al.add(100);
        }

        // fail safe
        CopyOnWriteArrayList cal = new CopyOnWriteArrayList();
        cal.add(100);
        cal.add(200);
        cal.add(300);
        System.out.println(cal);

        Iterator itr1 = cal.iterator();
        while (itr1.hasNext()) {
            System.out.println(itr1.next());
            al.add(100);
        }

    }
}
