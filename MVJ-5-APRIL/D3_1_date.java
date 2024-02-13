import java.sql.Date;

public class D3_1_date {
    public static void main(String[] args) {
        java.util.Date dt = new java.util.Date();
        System.out.println(dt);
        long time_in_ms = dt.getTime();
        //System.out.println(dt.getTime());
        java.sql.Date dt1 = new java.sql.Date(time_in_ms);
        System.out.println(dt1);
    }
}
