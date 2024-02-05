package m26_user_input_scanner;
import java.util.Scanner;
public class ScannerIntegers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your first Number : ");
        byte firstByteNum=input.nextByte();

        System.out.println("Enter your Second Number : ");
        short firstShortNum=input.nextShort();

        System.out.println("Enter your Third Number : ");
        int firstIntegerNum=input.nextInt();

        System.out.println("Enter your fourth Number : ");
        Long firstLongNum=input.nextLong();
//       /* input.close();
//
//        System.out.println("Enter your fifth Number : ");
//        Long fifthNum=input.nextLong();*/

        System.out.println("firstByteNum = " + firstByteNum);
        System.out.println("firstShortNum = " + firstShortNum);
        System.out.println("firstLongNum = " + firstLongNum);
        System.out.println("firstIntegerNum = " + firstIntegerNum);

        

    }
}
