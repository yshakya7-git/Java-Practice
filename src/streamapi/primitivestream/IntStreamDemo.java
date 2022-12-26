package streamapi.primitivestream;

import java.util.Arrays;


public class IntStreamDemo {
    public static void main(String[] args) {
        int sum= Arrays.stream(new int[]{2,5,4}).map(n->n*3).sum();
        int array= (int) Arrays.stream(new int[]{2,5,8,5,5,3,4}).count();
        double reduce=Arrays.stream(new double[]{22.5,55.5,5.5}).reduce(0,(a,b)->(a+b));
        System.out.println("Output for Integer Sum : " + sum);
        System.out.println("Output for Integer Array : " + array);
        System.out.println("Output for Double Reduce : " + reduce);
        System.out.println("Output for Double Reduce : " + reduce);

    }





}
