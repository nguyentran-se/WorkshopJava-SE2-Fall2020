
public class Exercise2 {

    public static void main(String[] args) {
        String original = "software";
        StringBuilder result = new StringBuilder("hi");
        int index = original.indexOf('a');//Answer: index = 5;

/*1*/   result.setCharAt(0, original.charAt(0));//Answer: result = si
/*2*/   result.setCharAt(1, original.charAt(original.length() - 1));//Answer: result se
/*3*/   result.insert(1, original.charAt(4));//Answer: result = swe
/*4*/   result.append(original.substring(1, 4));//Answer: result = sweoft
/*5*/   result.insert(3, (original.substring(index, index + 2) + " ")); //Answer: result = swear oft

        System.out.println(result);
    }
}
