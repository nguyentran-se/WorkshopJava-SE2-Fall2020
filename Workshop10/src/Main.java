
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car car1 = new Car("BMWZ1000", 2000, "BMW");
        Car car2 = new Car("DREAM", 4000, "HONDA");
        Car car3 = new Car("NOVO", 3000, "YAMAHA");
        Car car4 = new Car("FORD RANGER", 9000, "FORD");
        CarList carList = new CarList();
        carList.addItem(car1);
        carList.addItem(car2);
        carList.addItem(car3);
        carList.addItem(car4);
        System.out.println("---Display all items");
        carList.displayItems();
        System.out.println("---Number of items of a: " + carList.getSize());
        System.out.println("---Check empty or not.");
        if(carList.checkEmpty()){
            System.out.println("Car list is empty!");
        }
        else System.out.println("Car list is NOT empty!");
        System.out.print("---Delete item at position: ");
        int pos = sc.nextInt();
        carList.delete(pos);
        System.out.println("---After deleting");
        carList.displayItems();
        System.out.println("---After sorting");
        carList.sort();
        carList.displayItems();
        System.out.println("---Check exist");
        if(carList.search(car4)){
            System.out.println("Car is exists in a!");
        }
        else System.out.println("Car is NOT exists in a!");
    }
}
