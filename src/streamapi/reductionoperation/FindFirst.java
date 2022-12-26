package streamapi.reductionoperation;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirst {

    public void findFirst() {
        List<Integer> list = Arrays.asList(5215, 874854, 12121, 354215, 54550);
        Optional<Integer> find = list.stream().findFirst();
        if (find.isPresent()) {
            System.out.println(find.get());
        } else {
            System.out.println("No value!!!!!");
        }

    }
}
