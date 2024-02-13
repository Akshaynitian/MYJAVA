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

public class D10_2_IO_operatioin {
    public static void main(String[] args) throws IOException {
        File file1 = new File("pw.txt");
        System.out.println(file1.exists());
        file1.createNewFile();
        System.out.println(file1.exists());
        File dir = new File("PW");
        System.out.println(dir.exists());
        dir.mkdir();
        System.out.println(dir.exists());

    }
}
