package m36_array_list;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        
        // addAll(Collection):
        
        list.addAll(Arrays.asList("Java","Python","C++","Java","C++","Ruby"));
        System.out.println("list = " + list);

        //containsAll(Collection) : Returns true if the target collection contains all the elements
       boolean isAvailable= list.containsAll(Arrays.asList("Java","Python","GA"));
        System.out.println("isAvailable = " + isAvailable);

        // removeAll(Collection) : return true when All the elements removed
       boolean isremove= list.removeAll(Arrays.asList("Python"));
        System.out.println("isremove = " + isremove);
        System.out.println("list = " + list);

        // retainAll(Collection): opposite of removeAll

        list.retainAll(Arrays.asList("Java","Python"));
        System.out.println("list = " + list);



       //clear(): Removes all elements from the collection
        list.clear();
        System.out.println("list = " + list);

        
    }
}
