package m27_string_class_part1;

public class ConcatLowerCaseUpperCase {
    public static void main(String[] args) {
        String str="Cydeo";
        str= str.concat("School");
        System.out.println(str);
        str=str.toLowerCase();
        System.out.println("str = " + str);
    }
}
