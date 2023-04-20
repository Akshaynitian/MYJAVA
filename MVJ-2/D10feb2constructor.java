class demo {
    private int a, b;

    public demo() {
        System.out.println("ZERO PARAMETRIZED CONSTRUCTOR BY PROGRAMMER");
    }

    public demo(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void disp() {
        System.out.println(a + " " + b);
    }
}

public class D10feb2constructor {
    public static void main(String[] args) {
        demo obj = new demo();
        demo obj1 = new demo(10, 20);
        obj1.disp();
        obj.disp();
    }
}
