package m32_arrays_part2;

import java.util.Arrays;

public class ReverseArrayElements {
    public static void main(String[] args) {
        int[] x = {1, 2, 3, 4, 5};
        int[] reversedArr = reverseArr(x);
        System.out.println("reversedArr = " + Arrays.toString(reversedArr));
        double[] y = {1.0, 2.0, 3.5, 4.6, 5.9};
        double[] revDoubleArr = reverseArr(y);
        System.out.println("Arrays.toString(revDoubleArr) = " + Arrays.toString(revDoubleArr));

        String[] names = {"Zehra", "arthu", "Mia", "Pia"};
        String[] reverseArr = reverseArr(names);
        System.out.println("reverseArr = " + Arrays.toString(reverseArr));


    }

    public static int[] reverseArr(int[] inputArray) {

        if( inputArray.length<=1){
            System.out.println("Array is empty \t");
            return inputArray;
        }
        int[] reverseArr = new int[inputArray.length];
        for (int i = inputArray.length - 1, j = 0; i >= 0; i--, j++) {
            reverseArr[j] = inputArray[i];
        }

        return reverseArr;
    }

    public static double[] reverseArr(double[] numbers) {
        double[] reverseArray = new double[numbers.length];
        for (int i = numbers.length - 1, j = 0; i >= 0; i--, j++) {
            reverseArray[j] = numbers[i];
        }
        return reverseArray;
    }

    public static String[] reverseArr(String[] numbers) {
        String[] reverseArray = new String[numbers.length];
        for (int i = numbers.length - 1, j = 0; i >= 0; i--, j++) {
            reverseArray[j] = numbers[i];
        }
        return reverseArray;
    }

}
