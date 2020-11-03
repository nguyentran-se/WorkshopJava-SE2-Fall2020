
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Exercise1 {

    public static void main(String[] args) throws IOException {
        File fileInput = new File("C:\\Users\\Dell La\\Desktop\\JavaMaterial\\Workshop8\\src\\exercise1_input.txt");
        FileReader fr = new FileReader(fileInput);
        BufferedReader br = new BufferedReader(fr);
        File fileOutput = new File("C:\\Users\\Dell La\\Desktop\\JavaMaterial\\Workshop8\\src\\exercise1_output.txt");
        FileWriter fw = new FileWriter(fileOutput);
        BufferedWriter bw = new BufferedWriter(fw);
        String s = null;
        while ((s = br.readLine()) != null) {
            for(char c : s.toCharArray()){
                if(c >= 65 && c <= 90) c =  (char) ((c + 3 - (int)'A')%26 + (int)'A');
                else c =  (char) ((c + 3 - (int)'a')%26 + (int)'a');
                bw.write(c);
            }
            bw.append("\n");
        }
        br.close();
        fr.close();
        bw.close();
        fw.close();
        System.out.println("Successfull, Result in your file!");
    }
}
