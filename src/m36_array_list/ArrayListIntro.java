package m36_array_list;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListIntro {
    public static void main(String[] args) {
        System.out.println("--------------------Array----------------");

        int[] array=new int[5];
        System.out.println("Arrays.toString(array) = " + Arrays.toString(array));
        System.out.println("--------------------Array List---------------");

        ArrayList<Integer>  list1=new ArrayList<>();
        System.out.println("list1 = " + list1);
        ArrayList<Integer> list2=new ArrayList<>(Arrays.asList(10,20,30,40,50));
        System.out.println("list2 = " + list2);        
        


    }
}
