enum result {
    PASS, FAIL, NR;
}

public class D3_8_enum {
    public static void main(String[] args) {
        result res = result.PASS; // output is pass
        switch (res) {
            case PASS:
                System.out.println("passed");
                break;
            case FAIL:
                System.out.println("FAILED");
                break;
            case NR:
                System.out.println("NO RESULT");
                break;
        }
    }
}
