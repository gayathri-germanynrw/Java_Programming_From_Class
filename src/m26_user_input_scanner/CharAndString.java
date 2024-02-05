package m26_user_input_scanner;
import java.util.Scanner;
public class CharAndString {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println(" Enter a character: \n");
        String patter=input.next();
        System.out.println("You have entered : " + patter);
        System.out.println("Would you like to continue?");
        String pattern_String=input.next();
        System.out.println("You have entered : " + pattern_String);



    }
}
