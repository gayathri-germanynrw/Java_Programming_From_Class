package m35_java_lang_classes;

public class MathClass {
    public static void main(String[] args) {
       int res= Math.max(100,200);
        System.out.println(res);

       int num2= Math.abs(-100);
        System.out.println(num2);
        double douVal=Math.pow(2,3);
        System.out.println("power of 2 is "+douVal);


        System.out.println(Math.sqrt(100));
        System.out.println("-----------------------");
        System.out.println(Math.random());

        System.out.println("-------round , floor(rounded down)" +
                " and ceil(rounded up) -----");

        System.out.println(" round 10.7 is ---"+Math.round(10.7));
        System.out.println("round 10.3 is ----"+Math.round(10.3));


        System.out.println("floor val--->"+Math.floor(20.9));
        System.out.println("ceil val---->"+Math.ceil(20.7));
        System.out.println();
        System.out.println();







    }
}
