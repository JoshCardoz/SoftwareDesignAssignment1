public class Apple implements Fruit{
    double price = 0;
    @Override
    public String getFruit() {
        return "Apple has been created!";
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return this.price;
    }
}
