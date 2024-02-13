//import java.util.Scanner;

public class basic {
    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        int n = 5;// scan.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (i == 0 || j == 0 || j == n - 1 || i == n - 1 || (i + j) < (n - 1) / 2) {
                    System.out.println("*");
                } else {
                    System.out.println(" ");
                }
            }
            System.out.println();
        }
    }
}
