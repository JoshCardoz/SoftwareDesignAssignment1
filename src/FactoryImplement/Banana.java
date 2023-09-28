package FactoryImplement;

public class Banana implements Fruit {
    double price = 0;
    String name = "Banana";
    @Override
    public String getFruit() {
        return this.name + " has been created!";
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public String getName() {
        return name;
    }
}
