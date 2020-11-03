import java.util.Scanner;

public class Fraction {

    private int numerator;
    private int denominator;

    public Fraction() {
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    public void reduce() {
        if (numerator != 0) {
            int gcd = gcd(numerator, denominator);
            numerator = numerator / gcd;
            denominator = denominator / gcd;
        }
    }

    public int gcd(int n, int d) {
        n = Math.abs(n);
        d = Math.abs(d);
        while (n != d) {
            if (n > d) {
                n -= d;
            } else {
                d -= n;
            }
        }
        return n;
    }

    public void add(Fraction a, Fraction b) {
        Fraction res = new Fraction(3, 2);
        res.numerator = a.numerator * b.denominator + b.numerator * a.denominator;
        res.denominator = a.denominator * b.denominator;
        res.reduce();
        if (res.numerator != 0) {
            System.out.println("a + b = " + res);
        } else {
            System.out.println("a + b = " + res.numerator);
        }
    }

    public void subtract(Fraction a, Fraction b) {
        Fraction res = new Fraction(3, 2);
        res.numerator = a.numerator * b.denominator - b.numerator * a.denominator;
        res.denominator = a.denominator * b.denominator;
        res.reduce();
        if (res.numerator != 0) {
            System.out.println("a - b = " + res);
        } else {
            System.out.println("a - b = " + res.numerator);
        }
    }

    public void multiply(Fraction a, Fraction b) {
        Fraction res = new Fraction();
        res.numerator = a.numerator * b.numerator;
        res.denominator = a.denominator * b.denominator;
        res.reduce();
        if (res.numerator != 0) {
            System.out.println("a * b = " + res);
        } else {
            System.out.println("a * b = " + res.numerator);
        }
    }

    public void devide(Fraction a, Fraction b) {
        Fraction res = new Fraction();
        res.numerator = a.numerator * b.denominator;
        res.denominator = a.denominator * b.numerator;
        if (res.denominator == 0) {
            System.out.println("a / b = Can not solve because denominator of b is zero!!!");
        } else {
            res.reduce();
            System.out.println("a / b = " + res);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aNume = 0, aDeno = 0, bNume = 0, bDeno = 0;
        System.out.println("---NOTE: Denominator of fraction must be a nonzero integer!---");
        while (aDeno == 0) {
            System.out.println("Enter fraction of a, numerator and denominator: ");
            aNume = sc.nextInt();
            aDeno = sc.nextInt();
        }
        Fraction a = new Fraction(aNume, aDeno);
        while (bDeno == 0) {
            System.out.println("Enter fraction of b, numerator and denominator: ");
            bNume = sc.nextInt();
            bDeno = sc.nextInt();
        }
        Fraction b = new Fraction(bNume, bDeno);
        System.out.println("Reducing  ...");
        a.reduce();
        System.out.println("a = " + a);
        b.reduce();
        System.out.println("b = " + b);
        System.out.println("Computing ...");
        Fraction useMethod = new Fraction();
        useMethod.add(a, b);
        useMethod.subtract(a, b);
        useMethod.multiply(a, b);
        useMethod.devide(a, b);
    }
}