package FactoryImplement;

public class BananaFactory implements GroceryProductFactory {
    @Override
    public Fruit createFruit() {
        Fruit banana = new Banana();
        double price = FileReader.readFile(banana.getName());
        banana.setPrice(price);

        return banana;
    }
}
