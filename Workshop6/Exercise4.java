
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {
        Exercise4 useMethod = new Exercise4();
        /*phần demo 
        String s = "I a,m stude,nt";
        String s2 = "stu,dent am, I";
        System.out.println(useMethod.getReverseEachWord(s));
        System.out.println(useMethod.getEachWord(s2));*/
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String a = sc.nextLine();
        System.out.print("Enter string to check anagram: ");
        String b = sc.nextLine();
        if(useMethod.getReverseEachWord(a).equals(useMethod.getEachWord(b))) System.out.println("This is anagram case!");
        else System.out.println("This is NOT anagram case!");
    }
    
    public String getReverseEachWord(String s){
        String reverse = "";
        char[] ch = s.toCharArray();
        ArrayList<Integer> listPosition = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if(isWhiteSpace(ch[i])){
                listPosition.add(i);
            }
        }
        for (int i = listPosition.get(listPosition.size() - 1) + 1; i < s.length(); i++) {
            if(!isPunctuation(ch[i])) reverse += ch[i];
        }
        for (int i = listPosition.size() - 1; i >= 1; i--) {
            for(int j = listPosition.get(i - 1) + 1; j < listPosition.get(i); j++){
               if(!isPunctuation(ch[j])) reverse += ch[j];
            }
        }
        for (int i = 0; i < listPosition.get(0); i++) {
            if(!isPunctuation(ch[i])) reverse += ch[i];
        }
        return reverse;
    }
    
    public String getEachWord(String s){
        String result ="";
        for (int i = 0; i < s.length(); i++) {
            if(!isPunctuation(s.charAt(i)) && !isWhiteSpace(s.charAt(i))){
                result += s.charAt(i);
            }
        }
        return result;
    }
    
    public boolean isWhiteSpace(char c){
        return c == ' ' || c == '\n' || c == '\t';
    }
    
    public boolean isPunctuation(char c){
        return c == '?' || c == ',' || c == '.' || c == ';';
    }
    
}
