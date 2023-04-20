public class D6march_1_exception_handling {
    public static void main(String[] args) {
        int result = 0;
        int array[] = { 1, 2, 3, 4 };
        try {
            result = (6 / 0);
            System.out.println(array[5]);
            // System.out.println("IN TRY BLOCK");
        } catch (ArithmeticException obj) {
            System.out.println("SOMETHING WENT WRONG.." + obj);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(array[array.length - 1]);
            System.out.println("STAY IN YOUR LIMITS");
        }
        System.out.println(result + " " + "bye");
    }
}