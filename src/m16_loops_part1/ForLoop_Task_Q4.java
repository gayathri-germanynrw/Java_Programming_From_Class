package m16_loops_part1;

public class ForLoop_Task_Q4 {
    public static void main(String[] args) {
        int sum=0;
        int j=5;
        int i;
        for(i=0;i<10 && j>0;i++ , j--){
            if(i%3==0 || j%5==0){
                sum=sum+i+j;
            }
        }
        System.out.println("Sum =  "+sum);
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("j = " + 5+5+5);

    }
}
