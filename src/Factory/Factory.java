package Factory;

/**
 * Created by jh on 2017/5/9.
 */
public class Factory implements IFactory {
    @Override
    public IProduct creatProduct() {
        return new Product();
    }

    public static void main(String[] args){
        IFactory factory=new Factory();
    }
}
