import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class D3_5_API {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 3, 4, 5, 6);
        System.out.println(list);
        Stream<Integer> streamdata = list.stream();
        // System.out.println(streamdata);
        // streamdata.forEach(n -> System.out.println(n));
        long count = streamdata.count();
        System.out.println(count);
    }
}
