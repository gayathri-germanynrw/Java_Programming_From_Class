package m16_loops_part1;

public class ForLoop_Task_5 {
    public static void main(String[] args) {
        int kph=0;
        double mph=0.0;
        System.out.println("KPH\t\t MPH");
        System.out.println("______________");
        for(int i=20;i<=140;i+=10){
            kph=i;
            mph=kph*0.62;
            System.out.println(i+"\t\t"+mph);
        }
    }
}
