package m18_loops_part3;
import java.util.Scanner;
public class WhileLoopCondition {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num=0;
        while(num>=0){
            System.out.println("Enter your number : " );
            num=input.nextInt();
        }
        System.out.println("-----------------" );
        String answer="";


        while(!(answer.equalsIgnoreCase("yes")||answer.equalsIgnoreCase("no"))){
            System.out.println("Please enter yes or no \t");
            answer=input.next();
        }

    }



}
