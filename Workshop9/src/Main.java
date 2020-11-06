
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        while (true) {
            do {
                try {
                    System.out.print("Enter side a: ");
                    a = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter side b: ");
                    b = sc.nextInt();
                    System.out.print("Enter side c: ");
                    c = sc.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Wrong input! Try again!");
                    sc.nextLine();
                }
            } while (true);

            try {
                RightTriangle rt = new RightTriangle(a, b, c);
                System.out.println("This is a right triangle!");
            } catch (IllegalTriangleException ex1) {
                System.out.println("This is not a triangle!");
            } catch (IllegalRightTriangleException ex2) {
                System.out.println("This is not a right triangle!");
            }
            sc.nextLine();
            System.out.print("Continue?(Y/N): ");
            char choice = sc.nextLine().charAt(0);
            if (choice != 'Y' && choice != 'y') {
                break;
            }
            System.out.println("");
        }
    }
}
