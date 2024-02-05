package m31_arrays_part1;

public class ForEachLoop {
    public static void main(String[] args) {
        int[] numbers={10,20,30,40,50};
        for(int each:numbers){
            System.out.println("each = " + each);
        }
        System.out.println("-------------------------");
        String[] names = {"Zehra", "arthu", "Mia", "Pia"};
        for (String name : names) {
            System.out.println("name = " + name);
            
        }
        
    }
}
