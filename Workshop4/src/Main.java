
public class Main {

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.readTheLength();
        if (triangle.isTriangle()) {
            System.out.println("Triangle is valid");
            triangle.perimeterOfTriangle();
            triangle.areaOfTriangle();
            triangle.typeOfTriangle();
        } else {
            System.out.println("Triangle is invalid");
        }
    }
}
