import java.util.Scanner;
import java.math.*;
public class Calculator {
 
    public static float custom_add(float number_one, float number_two ){
        System.out.print(number_one + number_two);
        return(number_one + number_two);
    }

    public static void custom_subtract(float number_one, float number_two){

    }

    public static void custom_divide(float number_one , float number_two){

    }

    public static void custom_multiply(float number_one , float number_two){

    }

    public static void custom_Calculate(String Arithmetic, float number_one, float number_two){
        if(Arithmetic == "+"){
            custom_add(number_one, number_two);
        }

    }

    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int number_1 , number_2 ;
        System.out.print("Type in the first number: ");
        number_1 = input.nextInt();
        System.out.print("Type in the second number: ");
        number_2 = input.nextInt();

        float number_one =  number_1;
        float number_two = number_2;


        String Arithmetic;
        System.out.println("The operations are: + - * /");
        System.out.print("What arithmetic would you be performing? ");
        Arithmetic = input.next();

        System.out.print(number_one +" " + number_two);
        while(Arithmetic == "+"){
            custom_add(number_one, number_two);
        }

    }
}