package m12_operators_part2;

public class PrePostIncrement {
    public static void main(String[] args) {
        int x=10;
        int y=22;

        System.out.println(x++ + x); // post increment, first time 10 then 11
        System.out.println(x++ + ++y);// 11+23

    }
}
