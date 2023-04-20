import java.util.ArrayList;
import java.util.Iterator;

public class D20march_7_iterator {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(100);
        al.add(200);
        al.add(300);
        System.out.println(al);
        /*
         * for (int i = 0; i < al.size(); i++) {
         * Object o = al.get(i);
         * System.out.println(o);
         * }
         * for(Object o:al){
         * System.out.println(o);
         * }
         */
        Iterator itr = al.iterator();
        while (itr.hasNext()) {
            Integer i = (Integer) itr.next();
            System.out.println(i);
        }

    }
}
