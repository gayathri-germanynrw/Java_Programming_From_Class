package m35_java_lang_classes;

public class AutoBoxingIntro {
    public static void main(String[] args) {
        //Auto Boxing
        int a =100;  // primitive variable to wrapper class object
        Integer num1=a; // Auto boxing done implicitly

        long b=200;
      //  Integer num2=b;
        Long num3=b;

        byte c=50;
       // Integer num4=c;
        Byte num4=c;

        // UnBoxing
        Integer x=100;
        int y=x;

        long z=x; // Smaller primitive can be assigned Larger Primitive


        Double m=30.5;
        double n=m;

       // float o=n;  // Smaller primitive can be assigned Larger Primitive
                   // not Vice Versa






    }
}
