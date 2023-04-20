class akshay {
    public void a1() {
        System.out.println("DEFAULT");
    }

    public void a1(int a) { // method overloading
        System.out.println("DEFAULT" + " " + a);
    }
}

class pandey extends akshay {
    public void a1() { // method overriding
        System.out.println("AKSHAY PANDEY");
    }
}

class chaman extends akshay {

}

public class D20feb10_polymorphism {
    public static void main(String[] args) {
        akshay obj;
        pandey obj1 = new pandey();
        chaman obj2 = new chaman();
        obj = obj1; // but we can not give the address of obj1 to obj2 i.e.(obj1=obj2) and vice
                    // versa
        obj.a1(); // only parent class reference variable can store the address of its child class

        System.out.println("---------------------");

        obj = obj2;
        obj.a1();
    }
}
