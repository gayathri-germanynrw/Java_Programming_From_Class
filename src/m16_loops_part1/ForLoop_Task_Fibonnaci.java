package m16_loops_part1;

public class ForLoop_Task_Fibonnaci {
    public static void main(String[] args) {
        System.out.println();
        int num1 = 0;
        int num2 = 1;
        int sum = 0;
        for (int i = 0; i <=9; i++) {
            System.out.println(num1 + " ");
            sum = num1 + num2;
            num1 = num2;
            num2 = sum;
         }
    }
}
