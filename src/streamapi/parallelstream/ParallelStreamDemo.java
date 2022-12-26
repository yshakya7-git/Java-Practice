package streamapi.parallelstream;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamDemo {
    public static void main(String[] args) {
        List<Integer> abc= Arrays.asList(5,10,8,2,4,56);
        abc.parallelStream().forEach(n-> System.out.println("The list are : " + n));


        List<Integer> a=Arrays.asList(1,2,3,4);
        int sum= a.parallelStream().reduce(0,Integer::sum) + 5;
        System.out.println("The sum is : " + sum);
    }


}
