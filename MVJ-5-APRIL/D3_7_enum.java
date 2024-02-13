import javax.swing.text.PasswordView;

enum result {
    PASS, FAIL, NR;

    // public static final result PASS=new result();
    // public static final result FAIL=new result();
    // public static final result NR=new result();
    // bts this is actually performed
    int marks;

    result() {
        System.out.println("CONSTRUCTOR IN ENUM");
    }

    void setmarks(int marks) {
        this.marks = marks;
    }

    int getmarks() {
        return marks;
    }
}

public class D3_7_enum {
    public static void main(String[] args) {
        result.PASS.setmarks(50);
        int m1 = result.PASS.getmarks();
        System.out.println(m1);
    }
}
