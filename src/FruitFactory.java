public abstract class FruitFactory {
    public Fruit fetchFruit(){
        Fruit fruit = createFruit();
        return fruit;
    }
    public abstract Fruit createFruit();
}
