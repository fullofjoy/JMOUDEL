package Singleton;

/**
 * Created by jh on 2017/5/9.
 */
public class SSingleton {
    private static SSingleton singleton;

    private SSingleton() {
    }

    public static SSingleton getInstance() {
        if (singleton == null) {
            singleton = new SSingleton();
        }
        return singleton;
    }
}
