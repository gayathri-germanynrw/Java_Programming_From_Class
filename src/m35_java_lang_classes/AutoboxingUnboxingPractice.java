package m35_java_lang_classes;

import java.util.Arrays;

public class AutoboxingUnboxingPractice {
    public static void main(String[] args) {
        Integer[] numbers=new Integer[5];
        System.out.println("numbers = " + Arrays.toString(numbers));

        numbers[0]=10; // Auto Boxing... Primitive converted into Wrapper class object

        numbers[1]=20;
        numbers[2]=40;
        numbers[3]=30;
        numbers[4]=50;
        System.out.println("numbers = " + Arrays.toString(numbers));
        
        for(Integer eachElement:numbers){
            int value=eachElement;  //Unboxing
            System.out.println("value = " + value);
            
        }

    }
}
