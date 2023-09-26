public class Banana implements Fruit{
    double price = 0;
    @Override
    public String getFruit() {
        return "Banana has been created!";
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
