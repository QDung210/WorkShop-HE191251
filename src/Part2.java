


import java.util.*;


public class Part2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number 1: ");
        float num1 = sc.nextFloat();
        System.out.print("Input number 2: ");
        float num2 = sc.nextFloat();
        System.out.print("Input the operator: ");
        String operator = sc.next();
        if(operator.equals("+")){
            float result = num1 + num2;
            System.out.print("the result of: " + num1 + " + " + num2 + " = " + result);
        }
        else if(operator.equals("-")){
            float result = num1 - num2;
            System.out.print("the result of: " + num1 + " - " + num2 + " = " + result);
        }
        else if(operator.equals("/")){
            float result = num1 / num2;
            System.out.print("the result of: " + num1 + " / " + num2 + " = " + result);
        }
        else {
            float result = num1 * num2;
            System.out.print("the result of: " + num1 + " * " + num2 + " = " + result);
        }
    }
}
