class student {
    private int age;
    private String name;

    public student() {
        System.out.println("DEFAULT CONSTRUCTOR IS CALLED");
        age = 10;
        name = "AKSHAY";
    }

    public student(String name) {
        this.name = name;
        age = 15;
    }

    public student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void disp() {
        System.out.println(age + " " + name);
    }
}

public class D10feb3constructor_overloading {
    public static void main(String[] args) {
        student st1 = new student();
        st1.disp();

        student s2 = new student("akshay");
        s2.disp();

        student s3 = new student(18, "pandey");
        s3.disp();
    }
}
