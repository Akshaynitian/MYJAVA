class human { // super class ,parent class ,base class
    int age;

    void sleep() { // behaves as a function call
        age = 18;
        System.out.println("HUMAN NEEDS GOOD SLEEP");
        System.out.println(age);
    }
}

class student extends human { // child class ,sub class ,derived class
    // int age;
    // String name;
}

public class D20feb1_inheritance {
    public static void main(String[] args) {
        student st = new student();
        st.sleep();
    }
}
