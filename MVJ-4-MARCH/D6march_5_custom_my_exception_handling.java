//custom execption and throw keyword
class myException extends Exception {
    public myException() {

    }

    public myException(String msg) {
        super(msg);
    }
}

public class D6march_5_custom_my_exception_handling {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = -2;
        try {
            if (num2 < 0) {
                // System.out.println("ENTER A VALID NUMBER");
                Exception e = new myException("NEGATIVE NUMBER");
                throw e;
            } else {
                int result = num1 / num2;
                System.out.println(result);
            }
        } catch (Exception e) {
            System.out.println("ENTER A VALID NUMBER ........." + e);
        }
    }
}
