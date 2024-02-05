package m18_loops_part3;

public class Finra_do_while_loop {
    public static void main(String[] args) {
        int i=1;
        do{
            if(i%5==0)
           {
                System.out.print("RA\t");
            }
            else if(i%3==0) {
                System.out.print("FIN\t");
            }
            else  if((i%3==0)||(i%5==0)){
                System.out.print("FINRA\t");
            }
            else{
                System.out.print(i+"\t");
            }

            i++;
        }while(i<=20);
    }
}
