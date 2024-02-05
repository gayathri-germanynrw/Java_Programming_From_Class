package m15_selection_statements_part2;

public class FibbonacciSeries {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 1, sum = 0;
        for (int i = 0; i <= 8; i++) {
            System.out.print("  "+num1);
            sum = num1 + num2;
            num1 = num2;
            num2=sum;

        }
    }
}
