import java.util.Scanner;

public class Main {
    static class EuclidAlgorithm {
        public int euclidAlgorithm(int m, int n) {
            while (n != 0) {
                int r = m % n;
                m = n;
                n = r;
            }
            return m;
        }
    }

    public static void main(String[] args) {
        System.out.println("Euclids Algorithm == EA" + "," + " Sieve Of Erastothesenes == SE");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hello, what algorithm would you like to run today?");
        String algorithm_answer = scanner.nextLine();
        System.out.println(algorithm_answer);

        EuclidAlgorithm euclidAlgorithm = new EuclidAlgorithm();
        if (algorithm_answer.equals("EA")) {
            System.out.println("Let the first number be the greater number");
            System.out.println("Hello, please enter the first number:");
            int m = scanner.nextInt();

            System.out.println("Hello, please enter the second number:");
            int n = scanner.nextInt();
            int euclid = euclidAlgorithm.euclidAlgorithm(m, n);
            System.out.println("GCD of " + m + " and " + n + " is: " + euclid);
        } else if (algorithm_answer.equals("SE")) {
            System.out.println("Let the first number be the greater number");
            System.out.println("Hello, please enter the limit: ");
            int limit = scanner.nextInt();
            int limited = limit + 1;
            sieveOfEratosthenes(limited);
            System.out.println("Sieve Of Erastosthenes would be here soon");
        } else {
            System.out.println("Goodbye");
        }

        scanner.close();
    }

    public static void sieveOfEratosthenes(int limited) {
        // Create a boolean array to mark prime numbers
        boolean[] primes = new boolean[limited + 1];
        for (int i = 0; i <= limited; i++) {
            primes[i] = true; // Assume all numbers are prime initially
        }

        // Perform the sieving process
        for (int p = 2; p * p <= limited; p++) {
            if (primes[p]) {
                // Mark all multiples of p as non-prime
                for (int i = p * p; i <= limited; i += p) {
                    primes[i] = false;
                }
            }
        }

        // Print the prime numbers
        System.out.print("Prime numbers up to " + limited + ": ");
        for (int i = 2; i <= limited; i++) {
            if (primes[i]) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
