package m28_string_class_part2;


public class Unique_Character {
    public static void main(String[] args) {
        String str = "abbpo";
        String result = "";
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            int frequency = 0;
            for (int j = 0; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    frequency++;
                }
            }
            if ((result.indexOf(ch) == -1)) {     //repeating char will not add to result repeatedly
                if(frequency==1) {
                    result += ch ;

                }

            }

        }

        System.out.println("Unique charaters from given String = " + result);
    }


}






/*  package week6;

public class FrequencyOfCharacter {
    public static void main(String[] args) {
        String str = "abbcccddddeeeee";
        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            int frequency = 0;
            for (int j = 0; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    frequency++;
                }
            }
            if (!result.contains("" + ch + frequency))
                result += "" + ch + frequency;

        }
        System.out.println("result = " + result);


    }

}



 */


/*
Write a program that can remove the duplicated characters from a string

        Example:
            str = "aabbbcccc"

        Output:
            "abc"

Write a program that can return the unique characters from a string

        Example:
            str = "aabcccd"

        Output:
            "bd"
 */