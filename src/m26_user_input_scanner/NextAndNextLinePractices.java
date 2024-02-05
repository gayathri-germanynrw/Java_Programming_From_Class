package m26_user_input_scanner;

import java.util.Scanner;

public class NextAndNextLinePractices {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your age :");
        int age=input.nextInt();
        input.nextLine();
        System.out.println("Enter your Full Name:");
        String fullName=input.nextLine();
        input.close();

        System.out.println("age = " + age);
        System.out.println("fullName = " + fullName);
    }

}
