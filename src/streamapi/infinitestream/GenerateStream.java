package streamapi.infinitestream;

import java.util.stream.Stream;

public class GenerateStream {

    public  void generateRandomStream(){
        Stream.generate(Math::random).limit(4).forEach(System.out::println);
    }
}
