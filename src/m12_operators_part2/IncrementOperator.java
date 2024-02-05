package m12_operators_part2;

public class IncrementOperator {
    public static void main(String[] args) {
        int a=10;
        a=--a + a++ + a-- +a++;

        System.out.println("value of a-->"+a);

        int x=4;
        int y=--x * 4 - x++;
        System.out.println("print the value of x and y --"+x +"---"+y);

    }
}
