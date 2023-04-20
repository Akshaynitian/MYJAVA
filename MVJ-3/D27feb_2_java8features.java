interface a {
    void show();

    default void config() {
        System.out.println("IN CONFIG");
    }

    static void abc() {
        System.out.println("IN ABC");
    }
}

class b implements a {
    public void show() {
        System.out.println("IN SHOW");
    }
}

public class D27feb_2_java8features {
    public static void main(String[] args) {
        a obj = new b();
        obj.show();
        a.abc();
        obj.config();
    }
}
