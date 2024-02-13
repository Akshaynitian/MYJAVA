import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class D3_3_for_each {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        List<Integer> list2 = Arrays.asList(2, 3, 4, 5, 6);
        System.out.println(list2);

        for (Object o : list2) { // also used Integer in place of object
            System.out.print(o + " ");
        }
        System.out.println();

        /* 2ND METHOD FOR PRINT 
         * Consumer<Integer> cons = new Consumer<Integer>() {
         * 
         * @Override
         * public void accept(Integer i) {
         * System.out.print(i + " ");
         * }
         * };
         */
        //3RD METHOD FOR PRINT
        Consumer<Integer> cons = (Integer i) -> {
            System.out.print(i + " ");
        };
        list2.forEach(cons);

        // list2.forEach(n -> System.out.print(n + " ")); IST METHOD FOR PRINT
    }
}
