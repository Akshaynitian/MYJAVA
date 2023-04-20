//HANDLING VS DUCKING THE EXCEPTION
class demo {
    public void a() throws Exception {
        b();
    }

    public void b() throws Exception {
        int num1 = 8;
        int num2 = 0;
        // try {
        int result = num1 / num2;
        System.out.println(result);
        // } catch (Exception e) {
        // System.out.println("ERROR" + " " + e.getMessage());
        // }
    }
}

public class D6march_3_throws_exception_handling {
    public static void main(String[] args) {
        demo obj = new demo();
        try {
            obj.a();
        } catch (Exception e) {
            System.out.println("ERROR");
        }
    }
}
