package calulator;

public class Calculator {
    public static float Calculators(float first,float second, String operator){
        switch (operator){
            case "+":
                return first + second;
            case "-":
                return first - second;
            case "*":
                return first * second;
            case "/":
               try{
                    return first/second;
                } catch (ArithmeticException ignored){
                    ignored.printStackTrace();
                }
            default:
                return -1;
        }
    }
}
