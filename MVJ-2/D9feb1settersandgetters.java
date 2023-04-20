class student {
    private int age;
    private String name;

    public void setAge(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void show() {
        System.out.println(name + " " + age);
    }

}

public class D9feb1settersandgetters {
    public static void main(String[] args) {
        student obj = new student();
        student obj1 = new student();
        obj1.setAge(18, "pwskills");
        obj1.show();
        int studage = obj.getAge();
        System.out.println(studage);
    }
}
