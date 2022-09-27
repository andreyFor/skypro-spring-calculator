package pro.sky.skyprospringcalculator;

public class CalculatorService {

    public static String plus;

    public static String plus(int num1, int num2){
        if (num1 != 0 && num2 != 0){
            return num1 + " + " + num2 + " = " + (num1+num2);
        }else {
            return "error";
        }

    }
    public static String minus (int num1, int num2){
        if (num1 != 0 && num2 != 0){
            return num1 + " - " + num2 + " = " + (num1 - num2);
        }else {
            return "error";
        }
    }
    public static String multiply (int num1, int num2){
        if (num1 != 0 && num2 != 0){
            return num1 + " * " + num2 + " = " + (num1 * num2);
        }else {
            return "error";
        }
    }
    public static String divide (int num1, int num2){
        if (num1 != 0 && num2 != 0){
            return num1 + " / " + num2 + " = " + (num1 / num2);
        }else {
            return "error";
        }
    }

}
