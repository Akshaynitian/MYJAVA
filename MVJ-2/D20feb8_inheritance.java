class animal {
    void sleep() {
        System.out.println("animal need sleep");
    }

    public void eat() {
        System.out.println("EATING");
    }
}

class tiger extends animal {
    public void eat() {
        System.out.println("EATING is good");
    }
}

public class D20feb8_inheritance {
    public static void main(String[] args) {
        tiger t = new tiger();
        t.sleep();
        t.eat();
    }
}
