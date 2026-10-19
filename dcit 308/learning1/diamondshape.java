public class diamondshape {
    public static void main(String[] args) {
        int n = 11; // Set the desired number of rows (adjust as needed)

        // Print the upper half of the diamond
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" "); // Print spaces
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*"); // Print asterisks
            }
            System.out.println(); // Move to the next line
        }

        // Print the lower half of the diamond
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" "); // Print spaces
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*"); // Print asterisks
            }
            System.out.println(); // Move to the next line
        }
    }
}
