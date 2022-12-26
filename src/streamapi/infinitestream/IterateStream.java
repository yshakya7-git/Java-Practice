package streamapi.infinitestream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IterateStream {
    public void getIterate(){
        Stream<Integer> evenNumStream = Stream.iterate(3, i -> i * 3);

        List<Integer> collect = evenNumStream
                .limit(4)
                .collect(Collectors.toList());
        System.out.println(collect);
    }




}
