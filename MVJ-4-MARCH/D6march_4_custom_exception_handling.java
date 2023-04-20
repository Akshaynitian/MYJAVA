//custom execption and throw keyword
public class D6march_4_custom_exception_handling {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = -2;
        try {
            if (num2 < 0) {
                // System.out.println("ENTER A VALID NUMBER");
                // message throw kiya gya hai and that is negative number
                Exception e = new ArithmeticException("NEGATIVE NUMBER");
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
