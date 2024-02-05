package m15_selection_statements_part2;

public class SwitchConstantsExample {
    public static final int OPTION_ONE=1;
    public static final int OPTION_TWO=2;
    public static final int OPTION_THREE=3;



    public static void main(String[] args) {
        int choice=3;
        switch(choice){
            case OPTION_ONE -> {
                System.out.println("Option One selected : 1 ");
                System.out.println("Option 1 ");
                System.out.println("Option 1 ");
            }
            case OPTION_TWO,OPTION_THREE ->
            {
                System.out.println("Option Two and Three need to be selected : 2 ");
                System.out.println("Option 2 ");
                System.out.println("Option 2 ");
                System.out.println("Option 3 ");
                System.out.println("Option 3 ");
            }

            default-> System.out.println("in Default --> ");


        }

    }
}
