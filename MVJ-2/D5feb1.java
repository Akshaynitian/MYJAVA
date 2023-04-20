public class D5feb1 {
    public static void main(String[] args) {
        String s1 = "akshay pandey";
        // String s2 = "";
        // for (int i = s1.length() - 1; i >= 0; i--) {
        // s2 = s2 + s1.charAt(i);
        // }
        // System.out.println(s2);
        String s2[] = s1.split(" ");
        String s3 = "";
        for (int i = s2.length - 1; i >= 0; i--) {
            s3 = s3 + s2[i] + " ";
        }
        System.out.println(s3);

    }
}
