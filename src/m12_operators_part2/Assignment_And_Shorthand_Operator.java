package m12_operators_part2;

public class Assignment_And_Shorthand_Operator {
    public static void main(String[] args) {
        int x=10;
        x=x+35;
        System.out.println("value of x-->"+x);
        //shorthand or compound Assignment operator
        int y=10;
        y+=30;
        System.out.println("print the value of y-->"+y);
        // Two different operands then left side datatype will be taken

        int z=50;
        z+=40.67;
        System.out.println("print the value of z-->"+z);

    }
}
