package m21_methods_part2;

public class ReturnKeywordInVoidMethod {
    public static void main(String[] args) {
        eligibleToVote(100);
    }
    public static void eligibleToVote(int age){
        if(age<0 || age>150){
            System.err.println("Invalid age :"+age);
            return;
        }
        if(age>=18){
            System.out.println("You are eligible to Vote \t" + age);
        }else{
            System.out.println("You are not eligible to Vote \t" + age);
        }
    }
}
