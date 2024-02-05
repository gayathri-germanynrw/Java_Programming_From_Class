package m14_statements;

public class WeeklyWage {
    public static void main(String[] args) {
        int workingHours=35;
        double weeklyWage=0.0;
        if(workingHours>=40){
            weeklyWage=900*1.5;
            System.out.println("Weekly wage for Employee who" +
                    " working hours more than 40 --->"+weeklyWage);
        }
        else{
            System.out.println("Weekly wage for Employee who" +
                    " working hours less than 40 --->"+weeklyWage);
        }

    }
}
