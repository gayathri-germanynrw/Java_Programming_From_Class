package m21_methods_part2;

public class OddOrEven {
    public static void main(String[] args) {
        String result=oddOrEven(29);
        System.out.println("result = " + result);
        System.out.println("without assign the result \t"+oddOrEven(8));

    }

    public static String oddOrEven(int Number){
        if(Number%2==0){
            return "Even";
        }else{
            return "Odd";
        }

    }
}
