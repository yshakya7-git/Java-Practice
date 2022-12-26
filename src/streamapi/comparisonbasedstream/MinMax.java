package streamapi.comparisonbasedstream;

import java.util.Comparator;
import java.util.stream.Stream;

public class MinMax {

    public static void main(String[] args) {
        Integer highest = Stream.of(1, 2, 3, 77, 6, 5)
                .max(Comparator.comparing(Integer::byteValue))
                .get();


        Integer lowest = Stream.of(1, 2, 3, 77, 6, 5)
                .min(Comparator.comparing(Integer::valueOf))
                .get();

        System.out.println("The highest number is: " + highest);
        System.out.println("The lowest number is: " + lowest);

    }
}
