package m27_string_class_part1;

import java.util.Scanner;

public class LengthOfName {
    public static void main(String[] args) {
        Scanner userInput=new Scanner(System.in);
        System.out.println("enter your first name:");
       String firstName= userInput.next();
        System.out.println("enter your Last name:");
        String lastName=userInput.next();
        
        userInput.close();
        
        int total=firstName.length()+lastName.length();
        System.out.println("total = " + total);
    }
}
