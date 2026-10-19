// divide the larger number(n1) by the smaller number(n2)
// record the remainder (r)
// discard the larger number(n1) and replace it ny the smaller number(n2)
// n1 =n2
// make the smaller number(n2) become the remainder(r)
// repeat until n2 becomes 0 (following a div with a reamainder of 0)
// the greatest common divisor will be n1
// the largest number found that results in a remainder of 0

import java.util.Scanner;
public class euclid {

    public static void Euclids_GCF(int number1, int number2){
            while(number2!=0){
                int remainder = number1 % number2 ;
                number1 = number2;
                number2 = remainder;
           }
           System.out.println("GCD = " +number1);

    }
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int number1, number2;
        int remainder;

        System.out.println("The first input must be greater than the second input");

        System.out.print("Enter value 1: ");
        number1 = input.nextInt();
        System.out.print("Enter value 2: ");
        number2 = input.nextInt();
        Euclids_GCF(number1, number2);

    }
    
}
