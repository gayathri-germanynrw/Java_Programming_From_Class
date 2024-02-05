package m36_array_list;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String> grocerieList=new ArrayList<>();
        // add(object): Appends the specific element to the end of a List
        grocerieList.add("Apple");
        grocerieList.add("Orange");
        grocerieList.add("Apple");
        grocerieList.add("Juices");
        grocerieList.add("Pomogranate");
        System.out.println("grocerieList = " + grocerieList);


        //add(index,object) :inserts a specific Element at specific position index in the list
        grocerieList.add("Chicken");
        System.out.println("grocerieList = " + grocerieList);

        grocerieList.add(2,"Mutton");
        System.out.println("grocerieList = Mutton added in 2 location" + grocerieList);

        //size() : Returns the number of elements in the list
        System.out.println("grocerieList.size() = " + grocerieList.size());

        //get(index) :Returns the element at the given index
        
        String firstElement=grocerieList.get(0);
        System.out.println("firstElement = " + firstElement);
        
        String lastElement=grocerieList.get(grocerieList.size()-1);
        System.out.println("lastElement = " + lastElement);

        //set(index,object) : Replaces the element at the given index with the given element
        grocerieList.set(1,"Juices");
        System.out.println("grocerieList = " + grocerieList);

        // remove(int) : Removes value at given index
        grocerieList.remove(1);
        System.out.println("grocerieList = " + grocerieList);

        //remove(Object) : Removes the first occurrence of the specified element from this list, If it is present
        grocerieList.remove("Apple");
        System.out.println("grocerieList = " + grocerieList);

        //indexOf(object) : Returns the index the first occurence of a specific element


        grocerieList.add("Juices");
        grocerieList.add("Carrot");
        grocerieList.add("Tomato");
        grocerieList.add("Juices");
        System.out.println("grocerieList = " + grocerieList);


        System.out.println("grocerieList.indexOf = " +grocerieList.indexOf("Juices"));
        //Last index of : Last occurrence of that object
        System.out.println("grocerieList.indexOf = " +grocerieList.lastIndexOf("Juices"));

        // contains(object) : returns true if this list contains the specified Element
        // Case Sensitive

        System.out.println("grocerieList = " + grocerieList.contains("Milk"));

        // isEmpty() : Returns true if this list contains no elements
        System.out.println("grocerieList = " + grocerieList.isEmpty());



        //clear(); Removes all elements of the list

        //grocerieList.clear();
        System.out.println("grocerieList = " + grocerieList);
        System.out.println("grocerieList = " + grocerieList.isEmpty());



        // removeIf(Predicate) : It is used to remove all the elements from the list that specifies the given predicate
        System.out.println("grocerieList = " + grocerieList);
        grocerieList.removeIf(p-> p.startsWith("A"));
        System.out.println("grocerieList = removeIf --" + grocerieList);

    }
}
