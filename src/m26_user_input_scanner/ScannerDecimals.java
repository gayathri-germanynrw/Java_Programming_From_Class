package m26_user_input_scanner;
import java.util.Scanner;
public class ScannerDecimals {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your first decimal number: ");
        float num1=input.nextFloat();

        System.out.println("Enter your second decimal number: ");
        double num2=input.nextDouble();
        System.out.println("Enter true or false : ");
       boolean con=input.nextBoolean();

       //input.close();

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("con = " + con);

    }
}
