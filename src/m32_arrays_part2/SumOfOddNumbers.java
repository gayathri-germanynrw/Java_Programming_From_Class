package m32_arrays_part2;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        int[] x={2,5,7,2,3};
        int[] y={3,3,2,3,2,3};
       //int result= sumOfOddNum(x);
        int result=sumOfOddNum2(y);
        System.out.println("result = " + result);

    }
  // For Loop used
    public static int sumOfOddNum(int[] numbers){
        int sum=0;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]%2!=0) {
                sum += numbers[i];
                System.out.println("numbers[i] = " + numbers[i]);
            }
            
        }
return sum;
    }

    // For Each used

    public static int sumOfOddNum2(int[] nums){
        int total=0;
        for(int each:nums){
            if(each%2!=0){
                total+=each;  // each num from nums array
            }

        }
       return total;
    }


}
