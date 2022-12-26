package streamapi;

import java.util.Arrays;
import java.util.List;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2,3,4);
        int res= nums.stream()
                .map(a -> a * 2)
                .filter(ns -> ns % 2 == 0)
                .sorted().reduce(0,(a,b)-> a+b);

        System.out.println(res);
//                .forEach(n -> System.out.println(n));
    }


}
