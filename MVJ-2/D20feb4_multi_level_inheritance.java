class demo1 {
    void disp() {
        System.out.println("disp written in demo1 class");
    }
}

class demo2 extends demo1 {
    void disp1() {
        System.out.println("disp written in demo2 class");
    }
}

class demo3 extends demo2 {

}

public class D20feb4_multi_level_inheritance {
    public static void main(String[] args) {
        demo3 obj = new demo3();
        obj.disp();
    }
}
