package AbstractFactory;

/**
 * Created by jh on 2017/5/8.
 */
public class Client {
    public static void main(String[] args){
        IAnimalFactory blackAnimalFactory=new BlackAnimalFactory();
        ICat blackCat=blackAnimalFactory.createCat();
        blackCat.eat();
        IDog blackDog=blackAnimalFactory.createDog();
        blackDog.eat();
        IAnimalFactory whiteAnimalFactory=new WhiteAnimalFactory();
        ICat whiteCat=whiteAnimalFactory.createCat();
        whiteCat.eat();
        IDog whiteDog=whiteAnimalFactory.createDog();
        whiteDog.eat();
    }
}
