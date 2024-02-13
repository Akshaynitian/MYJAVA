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

public class D10_3_IO_operatioin {
    public static void main(String[] args) throws IOException {
        File dir = new File("PWJAVA");
        System.out.println(dir.isDirectory());// false
        dir.mkdir(); // directory is created
        System.out.println(dir.exists());// true

        File file1 = new File(dir, "pwskills.txt");
        System.out.println(file1.isFile()); // false
        file1.createNewFile(); // file is created
        System.out.println(file1.exists()); // true

        int count = 0;
        File f = new File("PWJAVA");
        String str[] = f.list();
        for (String name : str) {
            count++;
            System.out.println(name);
        }
        System.out.println("NO OF FILES ARE" + " " + count);

    }
}
