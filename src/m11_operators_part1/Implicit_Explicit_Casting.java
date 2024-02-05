package m11_operators_part1;

public class Implicit_Explicit_Casting {
    public static void main(String[] args) {
        //implicit casting
       /* byte num1=10;
        int num2=num1;
        System.out.println("print the value of num1-->"+num1);
        System.out.println("print the value of num2-->"+num2);
        */

        //explicit casting
        double double_val=10.9876;
        int val= (int) double_val;
        System.out.println("print the double_val--->"+double_val);
        System.out.println("print the int value--->"+val);



    }
}
