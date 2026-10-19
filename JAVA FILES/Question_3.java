
public class MAX {

        public static void main(String[] args){
            int largeArray[] = (8, 11, 12, 13, 44, 15, 2, 17, 55, 66, 87, 78, 90, 9); // 14 elements

            int smallest = largeArray[0];
            int largest = largeArray[0];

            for (int i =0 ; i <= 13 ; i++ ){
                if(largeArray[i] < smallest) smallest = largeArray[i];
                if (largeArray[i] > largest) largest = largeArray[i];
            }

                System.out.println("The smallest value in the array is: " + smallest) ;
                System.out.println("The largest value in the array is: " + largest) ;
           

        }
/*
 * 
 3.	Find Maximum
Write a method that returns the largest integer in the list.
You can assume that the list has at least one element.
 * 
 */

}

