package m16_loops_part1;

public class ForLoop_Task_3 {
    public static void main(String[] args) {
        int SumEven=0;
        int SumOdd=0;
        for (int i = 1; i <= 10; i++) {
          if (i % 2 == 0) SumEven+=i;

        }
        System.out.print("SumEven " + SumEven);
        System.out.println("\n-----------------------");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) SumOdd+=i;

        }
        System.out.print(" SumOdd " + SumOdd);

      }
}
