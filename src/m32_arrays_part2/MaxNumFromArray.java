package m32_arrays_part2;

public class MaxNumFromArray {
    public static void main(String[] args) {
        int[] x = {10, 2, 3, 40, 20};
        int result_maxNum = maxNumFromArr(x);
        System.out.println("result_maxNum = " + result_maxNum);

        int[] y = {6, 8, 3, 5, 1, 9};
        int result = maxNumFromArr(y);
        System.out.println("result y array= " + result);
  }

    public static int maxNumFromArr(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            System.out.println("Array is empty\t");
            return 0;
        }

        //{10,2,3,40,20}
        int maxNum = numbers[0];  //40
        for (int eachElem : numbers) {
            if (eachElem > maxNum) {
                maxNum = eachElem;
            }
        }
        return maxNum;
   }

}
