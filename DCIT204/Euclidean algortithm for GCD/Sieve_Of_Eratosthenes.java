// get input of the limit to find the number of primes between
// print the number of prime numbers within that range
// print the prime numbers 

import java.util.Scanner;
public class Sieve_Of_Eratosthenes{


    public static void sieve_of_eratosthenes(int limit_number){
        boolean[] numbers = new boolean[limit_number+1];

        for(int i = 2; i<limit_number ; i++){
            if (!numbers[i]){
                if (i!=2){
                    System.out.print(", ");
                }
                System.out.print(i);
                for (int j = i*2; j<limit_number ; j+=i){
                    numbers[j] = true;
                }
            }
        }

    }


    public static void main(String[]args){
        int limit_number;
        Scanner input = new Scanner(System.in);
        System.out.print("Type in the limit :");
        limit_number = input.nextInt();
        sieve_of_eratosthenes(limit_number);
    }

}