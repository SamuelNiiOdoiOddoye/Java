import java.util.Scanner;
public class Main {
   // public static void main(String[] args) {
    //    System.out.println("Hello world!");
    }

    /*
        1. get binary input from user
        2. convert the binary input into an array
        3. take all individual elements of the array and process them
        4. sum all processed elements into a decimal number
        5. display the decimal number

     */

    // this part of the code is to get a 4-bit binary number from the user
    class test {
        public static void main(String[ ] args) {

                // Decimal is the variable storing the decimal number
                System.out.println("Type in your decimal Number Here: ");
                Scanner sc = new Scanner(System.in);
                int Decimal = sc.nextInt();
                System.out.println(Decimal + " is the decimal number I've received");

            int dividing,f ;
                do {
                    f = Decimal / 2;


                }while(f != 1);

            }
         /*
            // st is the variable storing the 4-bit binary number

            System.out.println("Type in your Binary Number Here: ");
            Scanner sc = new Scanner(System.in);
            String st = sc.nextLine();
            // st.length[] is the array holding the elements of the st variable
            // This part of the code converts the input of the Binary variable into elements of the string_digit array
            String [] string_digit = st.split("");
            int [] int_digit=new int[st.length()];
           for(int i=0; i<st.length() ; i++){
           int_digit[i] = Integer.parseInt(string_digit[i]);
            }
            System.out.println( "This is in the array"+ " " + string_digit[0] + " " + string_digit[1] + " "+ string_digit[2]+ " " + string_digit[3]);
            // A variable to convert the elements in the string_digit array to a decimal number
            int To_Decimal = (int_digit[0]*8) + (int_digit[1]*4) + (int_digit[2]*2) + (int_digit[3]*1) ;
            System.out.println("The decimal equivalence of " + st + " is " + To_Decimal);

        }
    */

    }

