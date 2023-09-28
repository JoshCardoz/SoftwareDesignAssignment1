package FactoryImplement;

public class AppleFactory implements GroceryProductFactory {

    @Override
    public Fruit createFruit() {
        Fruit apple = new Apple();
        double price = FileReader.readFile(apple.getName());
        apple.setPrice(price);

        return apple;
    }
}
