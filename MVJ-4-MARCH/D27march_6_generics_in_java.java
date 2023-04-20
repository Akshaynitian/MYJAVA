import java.util.ArrayList;
import java.util.Scanner;

class gen<T> {
    T obj;

    public gen(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    void display() {
        System.out.println("akshay");
    }
}

public class D27march_6_generics_in_java {
    public static void main(String[] args) {
        String arr[] = new String[10];
        // Scanner scan = new Scanner(System.in);
        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = scan.nextLine();
        // }
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }
        ArrayList<String> al = new ArrayList<String>();
        al.add("akshay");
    }
}
