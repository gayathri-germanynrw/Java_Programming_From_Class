package m12_operators_part2;

public class MixedOperations {
    public static void main(String[] args) {
        byte num1=100;
        short num2=20;
        short num3= (short) (num1+num2);
        System.out.println("print the value of num3-->"+num3);
        int a=100;   // implicit casting, smaller value casted into larger datatype
        long b=200;
        long c=a+b;
        System.out.println("print-----"+c);

        int x=200;
        float y=30.5f;
        float z=x/y;
        System.out.println("-----z----"+z);


    }
}
