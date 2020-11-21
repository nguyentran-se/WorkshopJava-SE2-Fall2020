public class Car {
    private String name;
    private double price; 
    private String production;

    public Car() {
    }
    
    public Car(String name, double price, String production) {
        this.name = name;
        this.price = price;
        this.production = production;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    @Override
    public String toString() {
        return "Car{" + "name=" + name + ", price=" + price + ", production=" + production + '}';
    }
    
    
}
