package m36_array_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {
    public static void main(String[] args) {
        
        ArrayList<Integer> numbers=new ArrayList<>(Arrays.asList(3,5,1,5,20,0,35,5));
        System.out.println("numbers = " + numbers);
        
        //sort(list): sorts the elements of the given list in natural order
        Collections.sort(numbers);
        System.out.println("numbers = " + numbers);

        // binarySearch(list,element) : searches for the specified value in a sorted list in ascending order
        // Using a binary search algorithm
        

        System.out.println("numbers = " + Collections.binarySearch(numbers,5));

        //min(list): returns the minimum element in the collection , according to natural order
        int min=Collections.min(numbers);
        System.out.println("min = " + min);

        // max(list): returns the maximum element in the collection , according to natural order

        int max=Collections.max(numbers);
        System.out.println("max = " + max);
        
        //reverse(list): returns the order of the elements in the list
        Collections.reverse(numbers);
        System.out.println("numbers = " + numbers);

        //shuffle : Randomly shuffles(randomly reorder) the elements in the list

       // Collections.shuffle(numbers);
        System.out.println("numbers = " + numbers);

        // rotate(list,distance) : Rotates the elements in the list by specified distance
        Collections.sort(numbers);
        System.out.println("numbers = " + numbers);
        Collections.rotate(numbers,3);
        System.out.println("numbers = " + numbers);
        Collections.rotate(numbers,-3);
        System.out.println("numbers = " + numbers);

        //replaceAll(list,oldValue,newValue) : Replaces occurences of oldvalue with new value in the list
        Collections.replaceAll(numbers,5,500);
        System.out.println("numbers = " + numbers);

        //frequency(list,element) : Returns the frequency of occurence of a value in the collection
        int frequency=Collections.frequency(numbers,500);
        System.out.println("frequency = " + frequency);

        // fill(list,element) : Replaces all elements of the list with the specified value

        Collections.fill(numbers,500);
        System.out.println("numbers = " + numbers);












        
        
        

    }
}
