import java.util.Arrays;

public class D5feb3anagram {
    public static void main(String[] args) {
        String s1 = "keep";
        String s2 = "peek";
        // s1 = s1.replace(" ", "");
        // s2 = s2.replace(" ", "");
        // s1 = s1.toLowerCase();
        // s2 = s2.toLowerCase();
        char arr1[] = s1.toCharArray();
        char arr2[] = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("ANAGRAM");
        } else {
            System.out.println("NOT ANAGRAM");
        }
    }
}
