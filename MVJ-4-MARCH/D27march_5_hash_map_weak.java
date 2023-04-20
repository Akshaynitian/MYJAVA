import java.util.HashMap;
import java.util.WeakHashMap;

class employee {
    private String name;
    private int empid;

    public employee(String name, int empid) {
        this.name = name;
        this.empid = empid;
    }

    public String tostString() {
        return empid + " ";
    }

    @Override
    public void finalize() {
        System.out.println("garbage collector before deallocating memory from heap");
    }
}

public class D27march_5_hash_map_weak {
    public static void main(String[] args) {
        employee em = new employee("akshay ", 2204009);
        WeakHashMap hm = new WeakHashMap();
        hm.put(em, "akshay");
        System.out.println(hm);
        em = null; // eligible for garbage colletion
        System.gc(); // invoking garbage collector
        System.out.println(hm);
        System.out.println("last line");
    }
}
