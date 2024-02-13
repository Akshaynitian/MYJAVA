enum week {
    MON, TUE, WED, THU, FRI, SAT, SUN;
}

public class D3_6_enum {
    enum Result {
        PASS, FAIL, NR;
    }

    public static void main(String[] args) {
        week w = week.FRI;
        System.out.println(w);
        Result r = Result.FAIL;
        System.out.println(r);
        week wr[] = week.values();
        for (week w1 : wr) {
            System.out.println(w1 + " : " + w1.ordinal());
        }
    }
}
