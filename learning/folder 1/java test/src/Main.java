import java.awt.*;
import java.util.Locale;
import java.util.Scanner;

public class Main{
    public static void main(String[]args){

//        class DisplayText{
//            System.out.println("Hello World");
//        }
    System.out.println("This print is not within the class");

    // referencing in java
//        Point point1 = new Point(x:1, y:2);
//        Point point2 = point1;
//        point1.x = 2;
//        System.out.println(point2);
        String input = "";
        Scanner variable = new Scanner(System.in);

        // a while loop in java
        while(!input.equals("quit")){
            System.out.print("Input: ");
            input = variable.next().toLowerCase();
            System.out.println(input);

        }

    }
    }
