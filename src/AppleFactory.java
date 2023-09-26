public class AppleFactory extends FruitFactory{
    @Override
    public Fruit createFruit() {
        Fruit apple = new Apple();
        apple.setPrice(20); //fetch from textfile reader or some shit

        return apple;
    }
}
