package m35_java_lang_classes;

public class ParsingValues {
    public static void main(String[] args) {
        String str="20";

        int num=Integer.parseInt(str);  // AutoBoxing and Unboxing not happened here
        Integer num1=Integer.valueOf(str);
        Integer num2=num;  // Auto Boxing ( primitive o
        System.out.println( num2);

        System.out.println("------------------------------");

        String s="20.5";
        System.out.println( s+1);
        double val= Double.parseDouble(s);  // if u want Autoboxing then assign to Double
                                             // If u don't want to apply then assign to double primitive data Type
        System.out.println(val+2);

        //double val2= Double.valueOf(s);  // unboxing
        Double val2= Double.valueOf(s);

        System.out.println(val2);
    }
}
