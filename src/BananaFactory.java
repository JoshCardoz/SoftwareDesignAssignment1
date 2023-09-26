public class BananaFactory extends FruitFactory{
    @Override
    public Fruit createFruit() {
        Fruit banana = new Banana();
        banana.setPrice(10); //fetch from textfile reader or some shit

        return banana;
    }
}
