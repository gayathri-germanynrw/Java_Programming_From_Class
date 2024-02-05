package m27_string_class_part1;

public class EqualsMethodVsEqualsOperator {
    public static void main(String[] args) {
        String str1="Java",
                str2="Java";
        System.out.println(str1== str2); //same object?
        System.out.println(str1.equals(str1)); //have the same character in same order?

        String str3=new String("Java");
        String str4=new String("Java");
        System.out.println(str3==str4);
        System.out.println(str3.equals(str4));

        System.out.println(str1.equals(str3));

        String str5="java";
        System.out.println(str1.equals(str5));


    }
}
