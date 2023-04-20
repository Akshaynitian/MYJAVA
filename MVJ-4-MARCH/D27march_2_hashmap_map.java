import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class D27march_2_hashmap_map {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        hm.put(01, "virat"); // entry
        hm.put(02, "rohit");
        hm.put(03, "akshay");
        hm.put("kohli", "virat");
        hm.put(04, 5);
        System.out.println(hm);
        System.out.println(hm.get(4));

        Set keyset = hm.keySet(); // return keys
        Iterator itr = keyset.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();

        Collection values = hm.values();
        Iterator itr2 = values.iterator();
        while (itr2.hasNext()) {
            System.out.print(itr2.next() + " ");
        }
    }
}
