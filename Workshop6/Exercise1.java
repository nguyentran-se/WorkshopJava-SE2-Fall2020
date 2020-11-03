
public class Exercise1 {

    public static void main(String[] args) {
        String hannah = "Did Hannah see bees? Hannah did.";

/*a*/   System.out.println("Length of string hannah: " + hannah.length());

/*b*/   System.out.println("Character at 12th: " + hannah.charAt(12));

/*c*/   System.out.println("Expression that refers to letter b: " + hannah.charAt(15));

/*d*/   StringBuilder sb = new StringBuilder("Able was I ere I saw Elba.");
        //Answer: Create a string by constructor of StringBuilder.
        
/*e*/   String s = "Was it a car or a cat I saw?";
        System.out.println("substring(9, 12) of string s: " + s.substring(9, 12));
        
/*f*/   String hi = "Hi, ";
        String mom = "mom.";
        System.out.println("Method 1: " + hi + mom);
        System.out.println("Method 2: " + hi.concat(mom));
    }
}
