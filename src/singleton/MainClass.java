package singleton;

public class MainClass {
    public static void main(String[] args) {
        SingletonDemo singletonDemo = SingletonDemo.getInstance();
        singletonDemo.getConnection();
        System.out.println(singletonDemo.getVal());
        singletonDemo.incrementVal();
        System.out.println(singletonDemo.getVal());


        SingletonDemo newObj = SingletonDemo.getInstance();
        newObj.getConnection();
        System.out.println(newObj.getVal());
        newObj.incrementVal();
        System.out.println(newObj.getVal());

        SingletonDemo newObj1 = SingletonDemo.getInstance();
        newObj1.getConnection();
        System.out.println(newObj1.getVal());
        newObj1.incrementVal();
        System.out.println(newObj1.getVal());
    }
}
