package m22_methods_part3;

public class ReturnMethodPractice {
    public static void main(String[] args) {
        double res=calculate(10.0, '|', 20.0);
        System.out.println("res = " + res);
    }

    public static double calculate(double num1, char mathOperator, double num2) {
        boolean validOperator = mathOperator == '+' || mathOperator == '-' || mathOperator == '*' || mathOperator == '/' || mathOperator == '%';
        if (!validOperator) {
            //System.err.println("Invalid Operator :" );
            return 0;
        }
        double result_ternary = (mathOperator == '+') ? num1 + num2 :
                (mathOperator == '-') ? num1 - num2 :
                        (mathOperator == '*') ? num1 * num2 :
                                (mathOperator == '/') ? num1 / num2 :
                                        num1 % num2;

        return result_ternary;
    }
}
