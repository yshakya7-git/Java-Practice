package streamapi.reductionoperation;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindAnyDemo {

    public void findAny() {
        List<String> asList = Arrays.asList("Hi","This","Is","Yunika","Shakya");
        Optional<String> find = asList.stream().findAny();
        if (find.isPresent()) {
            System.out.println(find.get());
        } else {
            System.out.println("No value!!!!!");
        }

    }
}
