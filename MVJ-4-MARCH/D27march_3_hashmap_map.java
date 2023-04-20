import java.util.HashMap;
import java.util.Map;

class student {
    private String name;
    private String city;
    private int age;

    public student(String name, int age, String city) {
        this.name = name;
        this.city = city;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return name + " " + age + " " + city;
    }

}

public class D27march_3_hashmap_map {
    public static void main(String[] args) {
        student std1 = new student("akshay", 20, "pandey");
        student std2 = new student("virat", 18, "kohli");
        student std3 = new student("ms", 7, "dhoni");
        Map map = new HashMap();
        map.put(1, std1);
        map.put(2, std2);
        map.put(3, std3);
        System.out.println(map);

    }
}
