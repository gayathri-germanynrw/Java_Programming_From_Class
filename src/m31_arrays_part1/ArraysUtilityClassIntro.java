package m31_arrays_part1;

import java.util.Arrays;

public class ArraysUtilityClassIntro {
    public static void main(String[] args) {
        //tostring(arr) : Returns the String representation of the contents of this array
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("Arrays.toString(numbers) = " + Arrays.toString(numbers));

        //equals(arr) : checks if both arrays are equal or not
        int[] numOneArr = {10, 20, 30, 50, 50};
        int[] numTwoArr = {10, 20, 30, 40, 50};
        System.out.println(numOneArr == numTwoArr);
        System.out.println("Is both array is equal or not \t = " + Arrays.equals(numOneArr, numTwoArr));

        // sort(arr) : sorts the element in ascending order

        int[] n1 = {10, 20, 30, 50, 50};
        String[] names = {"Zehra", "arthu", "Mia", "Pia"};
        Arrays.sort(n1);
        System.out.println("Arrays.toString(n1) = " + Arrays.toString(n1));
        Arrays.sort(names);
        System.out.println("in ascending order \t" + Arrays.toString(names));

        //BinarySearch  ( It should be ascending order )

        int[] getIndexFromKey = {1000, 80, 30, 40, 50};
        Arrays.sort(getIndexFromKey);
        System.out.println(Arrays.binarySearch(getIndexFromKey,40));

        // copyOf(arr,length) : Copies specified array and returns a new array

        double[] d1={1.0,3.0,8.0,39.7};
        double[] d2=d1;  //not copied ,one object ONLY
        System.out.println(d1==d2);
        double[] d3=Arrays.copyOf(d1,d1.length-1);
        System.out.println("d3[] array\t"+Arrays.toString(d3));

        //copyOfRange(arr,from,to) : copies of specified array , and returns new array.

        int[] copyFromArr = {10, 20, 30, 50, 60};
        int[]  copyToArr=Arrays.copyOfRange(copyFromArr,1,4);
        System.out.println("Arrays.toString(copyToArr) = " + Arrays.toString(copyToArr));
        
        //fill(arr,value): Assigns the specified value to each element of the specified array
        int[] fillFromArr = new int[5];
        System.out.println("Arrays.toString(fillFromArr) = " + Arrays.toString(fillFromArr));
        Arrays.fill(fillFromArr,20);
        System.out.println("Arrays.toString(fillFromArr) = After " + Arrays.toString(fillFromArr));


    }
}
