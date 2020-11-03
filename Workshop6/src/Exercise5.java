
import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Exercise5 useMethod = new Exercise5();
        System.out.println("Enter string:");
        String str = sc.nextLine();
/*a*/   System.out.println("a)");
        if(useMethod.countAppearance(str, "me") == 0) System.out.println("  String does not contain \"me\".");
        else System.out.println("  String contains \"me\"");
        if(useMethod.countAppearance(str, "why") == 0) System.out.println("  String does not contain \"why\".");
        else System.out.println("  String contains \"why\"");
        if(useMethod.countAppearance(str, "well") == 0) System.out.println("  String does not contain \"well\".");
        else System.out.println("  String contains \"well\"");
/*b*/   System.out.println("b)");
        System.out.println("  \"you\" appear in string " + useMethod.countAppearance(str, "you") + " times.");
/*c*/   System.out.println("c) Upper case first character:");
        str = useMethod.upperFirstCha(str);
        System.out.println(str);
/*d*/   System.out.println("d) Replace first to lower case and upper case last character:");
        str = useMethod.upperLastCha(str);
        System.out.println(str);
/*e*/   System.out.println("e) Display increasing order");
        useMethod.displayIncreasingOrder(str);
/*f*/   System.out.println("f) Remove first char with specific character");
        System.out.print("Enter character you want to remove: ");
        char c = sc.next().charAt(0);
        str = useMethod.removeFirstCharacterBy(str, c);
        System.out.println(str);
/*g*/   System.out.println("g) Count word");
        useMethod.countWord(str);
/*h*/   System.out.println("h) Print all letters");
        useMethod.printAllLetters(str);
/*i*/   System.out.println("i) Reverse string");
        str = useMethod.reverseString(str);
        System.out.println(str);
/*j*/   System.out.println("j) Replace letter");
        str = str.replace('a', 'A');
        str = str.replace('b', 'B');
        System.out.println(str);
/*k*/   System.out.println("k) Count upper letter");
        System.out.println("A number of upper letter in string is: " + useMethod.countUpperLetter(str));
    }
    
    public int countAppearance(String s ,String keySearch){
        int count = 0;
        for (int i = 0; i < s.length() - (keySearch.length() - 1); i++) {
            if(keySearch.equals(s.substring(i, i + keySearch.length()))) count++;  
        }
        return count;
    }
    
    public String upperFirstCha(String s){
        char[] ch = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if(i == 0 && !isWhiteSpace(ch[i]) || !isWhiteSpace(ch[i]) && isWhiteSpace(ch[i - 1])){
                ch[i] = (char)(ch[i] - 'a' + 'A');
            }
        }
        String result = new String(ch);
        return result;
    }
    
    public String upperLastCha(String s){
        char[] ch = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if(i == 0 && !isWhiteSpace(ch[i]) || !isWhiteSpace(ch[i]) && isWhiteSpace(ch[i - 1])){
                ch[i] = (char)(ch[i] + 'a' - 'A');
            }
        }
        for (int i = s.length() - 1; i >= 0; i--) {
            if(i == s.length() - 1 && !isWhiteSpace(ch[i]) ||!isWhiteSpace(ch[i]) && isWhiteSpace(ch[i+1])){
                ch[i] = (char)(ch[i] - 'a' + 'A');
            }
        }
        String result = new String(ch);
        return result;
    }
    
    public void displayIncreasingOrder(String s){
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length - 1; i++) {
            for (int j = 0; j < ch.length - i - 1; j++) {
                if(ch[j] > ch[j + 1]){
                    char temp = ch[j];
                    ch[j] = ch[j + 1];
                    ch[j + 1] = temp;
                }
            }
        }
        for (char c : ch) {
            System.out.print(c);
        }
        System.out.println("");
    }
    
    public String removeFirstCharacterBy(String s, char c){
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < sb.length(); i++) {
            if(i == 0 && !isWhiteSpace(sb.charAt(i)) || !isWhiteSpace(sb.charAt(i)) && isWhiteSpace(sb.charAt(i - 1))){
                if(sb.charAt(i) == c){
                    sb.deleteCharAt(i);                  
                }
            }
        }
        return sb.toString();
    }
    
    public void countWord(String s){
        if(s.length() == 0) System.out.println("Empty string");
        else System.out.println("Words in string is: " + s.length());
    }   
    
    public void printAllLetters(String s){
        for (int i = 0; i < s.length(); i++) {
            if(!isWhiteSpace(s.charAt(i)) && !isPunctuation(s.charAt(i))){
                System.out.print(s.charAt(i));
            }
        }
        System.out.println("");
    }
    
    public String reverseString(String s){
        char[] ch = s.toCharArray();
        String result = "";
        for (int i = ch.length - 1; i >= 0; i--) {
            result += ch[i];
        }
        return result;
    }
    
    public int countUpperLetter(String s){
        char[] ch = s.toCharArray();
        int count = 0;
        for (int i = 0; i < ch.length; i++) {
            if(ch[i] >= 'A' && ch[i] <= 'Z'){
                count++;
            }
        }
        return count;
    }
    
    public boolean isWhiteSpace(char c){
        return c == ' ' || c == '\n' || c == '\t';
    }
    
    public boolean isPunctuation(char c){
        return c == '?' || c == ',' || c == '.' || c == ';';
    }
}