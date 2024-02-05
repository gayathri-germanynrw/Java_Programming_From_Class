package m31_arrays_part1;

public class IterateAnArray {
    public static void main(String[] args) {
        int[] numbers={10,20,30,40,50,60,70};

        // Get Element from first to last

//        for(int i=0;i<numbers.length;i++){
//            System.out.println("numbers[i] \t"+ i+"\t" + numbers[i]);
//        }
        // Get Element from last to first

        for(int j=numbers.length-1;j>=0;j--){
            System.out.println("numbers[j] \t"+ j+"\t" + numbers[j]);
        }
    }


}
