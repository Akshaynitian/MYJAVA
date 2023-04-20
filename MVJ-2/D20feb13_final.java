class animal {
    final int age=20;
    final void sleep() {
        System.out.println("animal need sleep");
    }
}
class tiger extends animal {
    
}
public class D20feb13_final {
    public static void main(String[] args) {
        tiger obj = new tiger();
        obj.sleep();
    }
}