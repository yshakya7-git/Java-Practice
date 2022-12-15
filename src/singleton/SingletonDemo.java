package singleton;

import java.io.Serializable;

public class SingletonDemo implements Serializable {
    private static SingletonDemo singleObj;
    private Integer val = 0;
    private SingletonDemo() {
    }
    public Integer getVal() {
        return this.val;
    }
    public static SingletonDemo getInstance() {
        if (singleObj == null) {
            singleObj = new SingletonDemo();
        }
        return singleObj;
    }
    public void incrementVal() {
        this.val++;
        System.out.println("Value has been incremented!");
    }
    public void getConnection() {
        System.out.println("I am connected!!!!");
    }
}
