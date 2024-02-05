package m21_methods_part2;

public class ParametersArgumentsIntro {
    public static void main(String[] args) {
        eligibleToVote(11);
    }

    public static void eligibleToVote(int age){
        if(age>=18){
            System.out.println("You are eligible to vote  " + age);
        }else{
            System.out.println("You are not eligible to Vote" + age);
        }

    }
}
