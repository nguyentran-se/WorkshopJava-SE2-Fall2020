
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("You are in directory: ...Workshop8\\src\\");
        System.out.print("Enter name of file you want to display: ");
        String fileName = sc.nextLine();
        File file = new File("src\\", fileName);
        if (file.exists()) {
            System.out.println("Data from file:");
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        } else {
            System.out.println("ERROR! FILE DOES NOT EXIST!");
        }
    }
}
