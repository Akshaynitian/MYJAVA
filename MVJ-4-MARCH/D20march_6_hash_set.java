import java.util.HashSet;
import java.util.LinkedHashSet;

import javax.xml.transform.Source;

public class D20march_6_hash_set {
    public static void main(String[] args) {
        HashSet hs = new HashSet<>();
        hs.add(100);
        hs.add(25);
        hs.add(30);
        hs.add("akshay");
        System.out.println(hs);
        hs.add(100);
        System.out.println(hs);
        LinkedHashSet lhs = new LinkedHashSet<>();
        lhs.add(100);
        lhs.add(25);
        lhs.add("akshay");
        lhs.add(30);
        System.out.println(lhs);
        lhs.add(100);
        System.out.println(lhs);
    }
}
