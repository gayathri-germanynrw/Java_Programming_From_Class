package m18_loops_part3;

public class BranchingStatementsIntro {
    public static void main(String[] args) {
        for(char i='A';i<'E';i++){
            if(i=='C') break; // exist the current loop
            System.out.println("i = " + i);
        }

        System.out.println("------------------------------");

        for(int i=1;i<6;i++){
            if(i==3) continue; // jump to the next iteration
            System.out.println(i);
        }

    }
}
