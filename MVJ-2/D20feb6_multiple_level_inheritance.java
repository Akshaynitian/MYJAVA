class parent1 { // extends objects class
    void disp() {
        System.out.println("sleep");
    }

    int age = 19;
}

class parent2 { // extends objects class
    int age = 20;
}

class child extends parent1 {

}

public class D20feb6_multiple_level_inheritance {
    public static void main(String[] args) {
        child obj = new child();
        System.out.println(obj.age);
    }
}
