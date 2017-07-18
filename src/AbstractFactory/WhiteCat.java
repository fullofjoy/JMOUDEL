package AbstractFactory;

/**
 * Created by jh on 2017/5/8.
 */
public class WhiteCat implements ICat {
    @Override
    public void eat() {
        System.out.println("The white cat is eating!");
    }
}
