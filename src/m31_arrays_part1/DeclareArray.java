package m31_arrays_part1;

import java.util.Arrays;

public class DeclareArray {
    public static void main(String[] args) {
        int[] scores;
        scores=new int[4];
        //System.out.println("scores = " + scores);
        scores[0]=85;
        scores[1]=75;
        scores[2]=95;
        scores[3]=100;

        System.out.println("Arrays.toString(scores) = " + Arrays.toString(scores));
        System.out.println("scores[0] = " + scores[0]);
        System.out.println("scores[1] = " + scores[1]);
        System.out.println("scores[2] = " + scores[2]);
        System.out.println("scores[3] = " + scores[3]);
        System.out.println("-------------------------------------");

        String[] names={"Gayathri","Kiruba Dev","Pranav","Dronav Sai"};
        System.out.println("names.toString() = " + Arrays.toString(names));
        System.out.println("names 1= " + names[0]);
        System.out.println("names 2= " + names[1]);
        System.out.println("names 3= " + names[2]);
        System.out.println("names 4= " + names[3]);

        
        
        

    }
}
