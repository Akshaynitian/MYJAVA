import java.io.*;

class student {
    private String name;
    private int age;
    private String city;

    public student(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String toString() { // @override
        return name + " " + age + " " + city;
    }
}

public class D10_1_IO_operatioin {
    public static void main(String[] args) {
        student st1 = new student("virat", 34, "delhi");
        System.out.println(st1);
        student st2 = new student("sachin", 44, "mumbai");
        System.out.println(st2);
    } // jvm shut down and every memory is created in ram and connected to heap area
      // and ram is volatile memory
}
