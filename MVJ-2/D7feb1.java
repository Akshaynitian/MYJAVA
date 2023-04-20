import java.util.Scanner;

public class D7feb1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        int array[] = new int[age];
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }
        for (int ele : array) {
            System.out.print(ele + " ");
        }
    }
}
