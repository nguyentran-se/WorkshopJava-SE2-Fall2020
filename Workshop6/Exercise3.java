
import java.util.Scanner;


public class Exercise3 {
    public static void main(String[] args) {
        Exercise3 useMethod = new Exercise3();
        Scanner sc = new Scanner(System.in);
        String fullName = sc.nextLine();
        String result = fullName.substring(0, 1);
        for (int i = 0; i < fullName.length(); i++) {
            if(useMethod.isWhiteSpace(fullName.charAt(i))){
                result += fullName.charAt(i + 1);
            }
        }
        System.out.println(result);
    }
     public boolean isWhiteSpace(char c){
        return c == ' ' || c == '\n' || c == '\t';
    }
}
