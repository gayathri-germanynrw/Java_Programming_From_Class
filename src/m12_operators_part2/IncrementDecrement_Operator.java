package m12_operators_part2;

public class IncrementDecrement_Operator {
    public static void main(String[] args) {
        //pre increment
        int a=5;
        int b=++a;
        System.out.println("the value of a-->"+a);
        System.out.println("the value of b-->"+b);
        //post increment
        int x=5;
        int y=x++; // x=6, y=5
        System.out.println("the value of x-->"+x);
        System.out.println("the value of y-->"+y);

    }
}
