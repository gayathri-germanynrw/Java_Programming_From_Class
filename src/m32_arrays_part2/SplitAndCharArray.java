package m32_arrays_part2;

import java.util.Arrays;

public class SplitAndCharArray {
    public static void main(String[] args) {
        String str="Apple, Banana, Orange, Cherry, Strawberry";
        String[] arr_fruits=str.split(", ");
        System.out.println("arr_fruits--->"+Arrays.toString(arr_fruits));

        System.out.println("-----------------------------------------------");
        String str2="Hello";
        char[] arr_char=str2.toCharArray();
        System.out.println("arr_char--->"+Arrays.toString(arr_char));

    }
}
