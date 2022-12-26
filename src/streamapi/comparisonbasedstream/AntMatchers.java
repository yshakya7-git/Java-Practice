package streamapi.comparisonbasedstream;

import java.util.Arrays;
import java.util.List;

public class AntMatchers {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(2, 4, 5, 6, 8);

        boolean allEven = intList.stream().allMatch(i -> i % 2 == 0);
        boolean oneEven = intList.stream().anyMatch(i -> i % 2 == 0);
        boolean noneMultipleOfThree = intList.stream().noneMatch(i -> i % 3 == 0);

        System.out.println(allEven);
        System.out.println(oneEven);
        System.out.println(noneMultipleOfThree);
    }

}
