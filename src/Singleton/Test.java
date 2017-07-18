package Singleton;

/**
 * Created by jh on 2017/5/9.
 */
public class Test {
    public static void main(String[] args){
        SSingleton singleton=SSingleton.getInstance();
        SSingleton singleton1=SSingleton.getInstance();
        System.out.println(singleton);
        System.out.println(singleton1);
    }
}
