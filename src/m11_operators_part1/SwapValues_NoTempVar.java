package m11_operators_part1;

public class SwapValues_NoTempVar {
    public static void main(String[] args) {
        int num1=10;
        int num2=5;
        num2=num1+num2;
        num1=num2-num1;
        num2=num2-num1;

        System.out.println("num1---->"+num1);
        System.out.println("num2---->"+num2);
    }
}
