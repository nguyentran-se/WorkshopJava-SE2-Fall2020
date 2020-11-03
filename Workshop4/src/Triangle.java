
import java.util.Scanner;

public class Triangle {

    float firstSide;
    float secondSide;
    float thirdSide;

    public Triangle() {
    }

    public Triangle(float firstSide, float secondSide, float thirdSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    public float getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(float firstSide) {
        this.firstSide = firstSide;
    }

    public float getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(float secondSide) {
        this.secondSide = secondSide;
    }

    public float getThirdSide() {
        return thirdSide;
    }

    public void setThirdSide(float thirdSide) {
        this.thirdSide = thirdSide;
    }

    public void readTheLength() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of fisrt side : ");
        firstSide = sc.nextFloat();
        System.out.print("Enter the length of second side: ");
        secondSide = sc.nextFloat();
        System.out.print("Enter the length of third side : ");
        thirdSide = sc.nextFloat();
    }

    public boolean isTriangle() {
        return firstSide + secondSide > thirdSide && firstSide + thirdSide > secondSide && secondSide + thirdSide > firstSide;
    }

    public void perimeterOfTriangle() {
        float perimeter = firstSide + secondSide + thirdSide;
        System.out.println("Perimeter of triangle is: " + perimeter);
    }

    public void areaOfTriangle() {
        float p = (firstSide + secondSide + thirdSide) / 2;
        float area = (float) Math.sqrt(p * (p - firstSide) * (p - secondSide) * (p - thirdSide));
        System.out.println("Area of triagnle is: " + area);
    }

    public void typeOfTriangle() {
        boolean check = false;
        float sqFirst = (float) Math.pow(firstSide, 2);
        float sqSecond = (float) Math.pow(secondSide, 2);
        float sqThird = (float) Math.pow(thirdSide, 2);
        if (firstSide == secondSide && secondSide == thirdSide && firstSide == thirdSide) {
            System.out.println("This is equilateral triangle");
            check = true;
        } else {
            if (sqFirst == sqThird + sqSecond || sqSecond == sqFirst + sqThird || sqThird == sqFirst + sqSecond) {
                System.out.print("This is right-angled triangle");
                check = true;
            }
            if (firstSide == secondSide || secondSide == thirdSide || firstSide == thirdSide) {
                System.out.println("This is isosceles triangle");
                check = true;
            }
        }
        if (!check) {
            System.out.println("This is normal triangle");
        }
    }
}
