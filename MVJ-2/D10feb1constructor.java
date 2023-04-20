class student {
    private int age;
    private String name;

    /*
     * public void show1() {
     * System.out.println(name + " " + age);
     * }
     */
    student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void show() {
        System.out.println(name + " " + age);
    }
}

public class D10feb1constructor {
    public static void main(String[] args) {
        student obj = new student(18, "akshay");
        obj.show();
        // obj.show1();
    }
}
