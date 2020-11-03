
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        //lấy file name từ user
        System.out.println("You are in directory ...Workshop8\\src\\");
        System.out.print("Enter name of file to copy (source): ");
        String fileName = sc.nextLine();
        //lấy folder name từ user
        System.out.println("---Note: You should enter directory properly!---");
        System.out.println("Example: C:\\\\Users\\\\Dell La\\\\Desktop\\\\Test\\\\");
        System.out.print("Enter folder name (dest): ");
        String folderName = sc.nextLine();
        //copy file
        String getDest = folderName + fileName;
        File src = new File("src\\", fileName);
        File folder = new File(folderName);
        File dest = new File(getDest);
        if (src.exists() && folder.isDirectory() && folder.exists()) {
            Files.copy(src.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
            System.out.println("");
            System.out.println("Copy successfully!");
        } else {
            System.out.println("");
            System.out.println("ERROR! SRC OR DEST DO NOT EXIST!");
        }
    }
}
