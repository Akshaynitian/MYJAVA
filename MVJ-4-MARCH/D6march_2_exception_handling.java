import java.util.InputMismatchException;
import java.util.Scanner;

public class D6march_2_exception_handling {
    public static void main(String[] args) {
        int num = 0;
        Scanner sc = new Scanner(System.in);
        try {
            num = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("ENTER A NUMBER");
        } finally {
            sc.close();
        }
        System.out.println(num);
    }
}
