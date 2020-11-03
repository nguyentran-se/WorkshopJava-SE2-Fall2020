
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        PhoneNumber phoneList[] = new PhoneNumber[1000];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter list of phone numbers");
        System.out.println("-----------------------------------------");
        int choice;
        int index = 0;
        do {
            System.out.print("Type of phone number ? (1 – local phone, "
                    + "2 – Inter phone number, 0 - exit): ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    PhoneNumber phoneNumber = new PhoneNumber();
                    System.out.print("Enter area code: ");
                    phoneNumber.area = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter number: ");
                    phoneNumber.number = sc.nextLine();
                    System.out.println("");
                    phoneList[index] = phoneNumber;
                    index++;
                    break;
                case 2:
                    sc.nextLine();
                    IntPhoneNumber intPhoneNumber = new IntPhoneNumber();
                    System.out.print("Enter country code: ");
                    intPhoneNumber.setCountryCode(sc.nextLine());
                    System.out.print("Enter area code: ");
                    intPhoneNumber.area = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter number: ");
                    intPhoneNumber.number = sc.nextLine();
                    System.out.println("");
                    phoneList[index] = intPhoneNumber;
                    index++;
                    break;
                default:
                    if(choice != 0) System.out.println("This case does not exist!");
            }
        } while (choice != 0);
        System.out.println("");
        System.out.println("List of phone number:");
        System.out.println("----------------------------------------");
        for (int i = 0; i < index; i++) {
            phoneList[i].display();
        }
    }
}
