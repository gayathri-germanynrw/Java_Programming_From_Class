package m18_loops_part3;

public class SumOfEvenWhileLoop {
    public static void main(String[] args) {
        int i=1;
        int sum=0;
        while(i<=10){

            if(i%2==0) {
                System.out.print("print i value\t"+i);
                System.out.println();
                sum+=i;

                System.out.print("print "+sum);
            }
            i++;
        }
    }
}
