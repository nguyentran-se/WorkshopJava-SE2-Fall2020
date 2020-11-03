
public class PhoneNumber {

    protected int area;
    protected String number;

    public PhoneNumber() {
    }

    public PhoneNumber(int a, String n) {
        this.area = a;
        this.number = n;
    }

    public void display() {
        System.out.println(area + " - " + number);
    }

}
