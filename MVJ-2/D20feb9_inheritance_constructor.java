class demo1 {
    int a, b;

    public demo1() { // ZERO PARAMETRIZED
        System.out.println("PARENT CLASS CONSTRUCTOR");
    }

    public demo1(int x, int y) { // PARAMETRIZED
        System.out.println("PARAMETRIZED PARENT CLASS CONSTRUCTOR");
        a = x;
        b = y;
    }
}

class demo2 extends demo1 {
    int m, n;

    public demo2() { // ZERO PARAMETRIZED
        // super();
        System.out.println("CHILD CLASS CONSTRUCTOR");
    }

    public demo2(int x, int y) { // PARAMETRIZED
        System.out.println("PARAMETRIZED CHILD CLASS CONSTRUCTOR");
        m = x;
        n = y;
    }
}

public class D20feb9_inheritance_constructor {
    public static void main(String[] args) {
        demo1 d1 = new demo1(2, 5);
        demo2 d2 = new demo2();
    }
}
