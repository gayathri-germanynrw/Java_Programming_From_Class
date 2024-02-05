package m14_statements;

public class IfStatement {
    public static void main(String[] args) {
//        int a =10;
//        int b=30;
//        int c=100;
//        if((b==50)&&(c>=100)){
//            a=20;
//        }
//        System.out.println("print a-->"+a);

        int x=20;
        int y=20;
        if(x!=y) {
            if (x > y) {
                System.out.println("x is greater than y-->" + x);
            } else if (y > x) {
                System.out.println("y is greater than x-->" + y);
            }
        }
        else{
            System.out.println(" x is equal to y "+"x value"+ x+"y value " + y);

        }


    }
}
