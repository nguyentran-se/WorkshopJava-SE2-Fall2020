
public class IntPhoneNumber extends PhoneNumber {

    private String countryCode;

    public IntPhoneNumber() {
    }

    public IntPhoneNumber(String countryCode) {
        this.countryCode = countryCode;
    }

    public IntPhoneNumber(String cc, int a, String n) {
        super(a, n);
        this.countryCode = cc;
    }

    @Override
    public void display() {
        System.out.print(countryCode + " - ");
        super.display();
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
    

}
