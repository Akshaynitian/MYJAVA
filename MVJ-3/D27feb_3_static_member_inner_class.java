class a {
    public void show() {
        System.out.println("IN SHOW");
    }

    class b { // member class
        public void display() {
            System.out.println("IN DISPLAY");
        }
    }

    static class c { // static class
        public void abc() {
            System.out.println("IN ABC");
        }
    }
}

public class D27feb_3_static_member_inner_class {
    public static void main(String[] args) {
        a obj = new a();
        a.b obj1 = obj.new b();
        obj.show();
        // obj.display(); as it is undefined
        obj1.display();
        a.c obj2 = new a.c();
        obj2.abc();
    }
}
