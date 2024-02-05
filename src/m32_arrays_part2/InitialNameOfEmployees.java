package m32_arrays_part2;

import java.util.Arrays;

public class InitialNameOfEmployees {
    public static void main(String[] args) {
        String[] names = {"John Doe", "Gayathri Kasi", "Mia George", "Pia Bauer"};
        String[] resultArr = initialNameEmp(names);
        System.out.println("Arrays.toString(resultArr) = " + Arrays.toString(resultArr));

    }

    public static String[] initialNameEmp(String[] names) {
        String[] initialNameArr = new String[names.length];
        for (int i = 0, j = 0; i < names.length; i++, j++) {
            initialNameArr[i] = "\""+names[i].charAt(0) + "" +names[i].charAt(names[i].indexOf(" ") + 1)+"\"";
        }

        return initialNameArr;
    }

}
