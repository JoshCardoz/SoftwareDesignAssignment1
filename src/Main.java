public class Main {
    public static void main(String[] args) {
        FruitFactory factory1 = new AppleFactory();
        FruitFactory factory2 = new BananaFactory();

        Fruit apple = factory1.createFruit();
        System.out.println(apple.getFruit());
        System.out.println(apple.getPrice());

        Fruit banana = factory2.createFruit();
        System.out.println(banana.getFruit());
        System.out.println(banana.getPrice());

    }
}