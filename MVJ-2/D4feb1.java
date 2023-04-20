public class D4feb1 {
    public static void main(String[] args) {
        String s1 = "akshay";
        System.out.println(s1);
        // s1 = s1.concat("pandey");
        // System.out.println(s1);
        // System.out.println((Integer.SIZE / 8));
        String s2 = "akshay" + "pandey"; // in scp
        System.out.println(s2);
        String s3 = s1 + s2; // in heap area
        System.out.println(s3 + " " + (s3 == s2));
        String s4 = "akshay" + 100 + 99;
        System.out.println(s4);
    }
}
