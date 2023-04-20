class human { // super class ,parent class ,base class
    int age;
    private String name;

    public human() {
        System.out.println("HUMAN CLASS CONSTRUCTOR");
    }

    void sleep() { // behaves as a function call
        age = 18;
        System.out.println("HUMAN NEEDS GOOD SLEEP");
        System.out.println(age);
    }
}

class student extends human { // child class ,sub class ,derived class
    void disp() {
        System.out.println("THE AGE IS " + age);
        // System.out.println("THE NAME IS "+name);
    }
}

public class D20feb2_inheritance {
    public static void main(String[] args) {
        student st = new student();
        st.sleep();
        st.disp();
    }
}
