interface a {
    int num = 5;

    void show();
}

class b implements a {
    public void show() {
        System.out.println("IN SHOW");
    }
}

public class D27feb_1_interface {
    public static void main(String[] args) {
        System.out.println(a.num);
        b obj = new b();
        obj.show();
    }
}