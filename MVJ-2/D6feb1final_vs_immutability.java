public class D6feb1final_vs_immutability {
    public static void main(String[] args) {
        final StringBuffer s1 = new StringBuffer("virat");
        s1.append("kohli"); // ye ho jayega addition
        // s1=new StringBuffer("sachin"); // show error because s1 ke reference(address)
        // ko change nhi kiya ja
        // skta hai
        System.out.println(s1);
        StringBuilder s2 = new StringBuilder();
        System.out.println(s2.capacity());

    }
}
