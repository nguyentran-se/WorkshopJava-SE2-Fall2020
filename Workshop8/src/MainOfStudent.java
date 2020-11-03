
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class MainOfStudent {

    ArrayList<Student> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        MainOfStudent useMethod = new MainOfStudent();
        int choice;
        do {
            menu();
            System.out.print("Your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    useMethod.addStudent();
                    useMethod.saveStudentToFile();
                    break;
                case 2:
                    useMethod.readStudentFromFile();
                    break;
                default:
                    System.out.println("Thank you");
                    break;
            }
        } while (choice < 3 && choice >= 1);
    }

    public static void menu() {
        System.out.println("Menu");
        System.out.println("-------------------------------------------------");
        System.out.println("1. Add a list of Students and save to File");
        System.out.println("2. Loading list of Students from a File");
        System.out.println("3. Exit");
    }

    public void addStudent() {
        String check = "";
        do {
            Scanner sc = new Scanner(System.in);
            Student s = new Student();
            System.out.println("-Student " + (list.size() + 1) + "-");
            System.out.print("Enter name: ");
            s.setName(sc.nextLine());
            System.out.print("Enter age: ");
            s.setAge(sc.nextInt());
            System.out.print("Enter mark: ");
            s.setMark(sc.nextDouble());
            list.add(s);
            System.out.print("Do you wanna add more, Y/N? ");
            sc.nextLine();
            check = sc.nextLine();
        } while (!"n".equals(check));
        System.out.println("");
    }
    public void saveStudentToFile() throws FileNotFoundException, IOException{
        File file = new File("C:\\Users\\Dell La\\Desktop\\JavaMaterial\\Workshop8\\src\\savingStudent.txt");
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);
        for (Student student : list) {
            pw.println(student.getName() + '\t' + student.getAge() + '\t'
                    + student.getMark());
        }
        pw.close();
        bw.close();
        fw.close();
    }
    public void readStudentFromFile() throws FileNotFoundException{
        File file = new File("C:\\Users\\Dell La\\Desktop\\JavaMaterial\\Workshop8\\src\\savingStudent.txt");
        Scanner sc = new Scanner(file);
        System.out.println("Result from file");
        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
        System.out.println("");
    }
}
