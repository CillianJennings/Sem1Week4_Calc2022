package ie.atu.week4;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        System.out.println("Please Enter 2 Numbers");
        Scanner input = new Scanner(System.in);
        int firstNum = input.nextInt();
        int secondNum = input.nextInt();
        add(firstNum,secondNum);
        delete(firstNum,secondNum);
        multiply(firstNum,secondNum);
    }


    public static void add(int num1, int num2) {

        int addition = num1 + num2;
        System.out.println(addition);
    }

    public static void multiply(int num1, int num2){

        int multiply = num1 * num2;
        System.out.println(multiply);
    }

    public static void delete(int num1, int num2) {

        int delete = num1 - num2;
        System.out.println(delete);
    }

}
