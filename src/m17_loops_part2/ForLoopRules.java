package m17_loops_part2;

public class ForLoopRules {
    public static void main(String[] args) {
        /*for (int i = 0; i > -1; i++) {
            System.out.println("Cydeo");
        }*/

       /*  for(int i=0;i<11;){
            System.out.println("Gayathri");
        }   No condition , so infinite loop*/

        for (int i = 1,j=10,k=100; i < 11; i++,j+=10,k+=100) {
            System.out.println("i->"+i+"\tj->"+j+"\tk->"+k);
        }

        // loop variable cannot be used outside the for loop's body

    }
}
