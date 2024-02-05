package m28_string_class_part2;


public class FirstLetterCaps {
    public static void main(String[] args) {
        String inputString = "  code Needed ";
        String dotStr = ".";
        String res = inputString.charAt(2)+dotStr+inputString.charAt(7) +dotStr;
        System.out.println("res = " + res.toUpperCase().trim());




    }
}
