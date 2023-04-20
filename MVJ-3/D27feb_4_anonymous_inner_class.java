interface car {
    void drive(); // understood abstract and public method
}

/*
 * class wagonr implements car {
 * public void drive() {
 * System.out.println("DRIVING");
 * }
 * }
 */

public class D27feb_4_anonymous_inner_class {
    public static void main(String[] args) {
        car obj = new car() {
            public void drive() {
                System.out.println("LETS DRIVE");
            }
        };
        obj.drive();
    }
}
