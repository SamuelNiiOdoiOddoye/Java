import java.util.Scanner;
public class Main {
    /*
        Write a program that allows the user to enter the last 5 names candidates in a local election
        and the votes received by each candidate.
        The program should then output each candidate's name, the votes received by the candidate,
    and the percent of the total votes received by that candidate.
    Your Program should also output the winner of the election. A sample output is :
    Candidate 	Votes Received	% of Total Votes
    Johnson	    5000			25.91
    Miller	    4000			20.73
    Duffy		6000			31.09
    Robinson	2500			12.95
    Ashtony	    1800			9.33
    Total		19300			100
     */

    public static void main(String[] args) {
        String Contestants[] = new String[5];
        float vote[] = new float[6];

        // a for loop so user can input names of the candidates

        for(int i=0 ; i < 5 ; i++){
            System.out.println("Type in the Name of the next candidate: ");
            Scanner sc = new Scanner(System.in);
            Contestants[i] = sc.nextLine();

        }



        // a for loop so the user can input the votes of the 5 candidates
      //  System.out.println("You are to type in the votes now pls");
        for(int q=0 ;  q < 5 ; q++){
            System.out.println("Type in the votes of the next candidate: ");
            Scanner sc = new Scanner(System.in);
            vote[q] = sc.nextFloat();
        }

        // a variable to hold the sum of the test scores
        float Votes_Total = vote[0] + vote[1] + vote[2] + vote[3] + vote[4]  ;

        // float variables to hold the percentages of the candidates
        float percentage_1 , percentage_2 , percentage_3 , percentage_4 , percentage_5 ;
        float percentage_Total;

        // formula's for calculating the percentages of each candidate
        percentage_1 = (vote[0] / Votes_Total) * 100 ;
        percentage_2 = (vote[1] / Votes_Total) * 100 ;
        percentage_3 = (vote[2] / Votes_Total) * 100 ;
        percentage_4 = (vote[3] / Votes_Total) * 100 ;
        percentage_5 = (vote[4] / Votes_Total) * 100 ;
        percentage_Total = percentage_1 + percentage_2 + percentage_3 + percentage_4 + percentage_5 ;

        // Output of the candidates, their votes and percentages respectively
        System.out.println(" Candidate " + "  " + " Votes Received " + "  " + " % of Total Votes " );
        System.out.println(" " + Contestants[0] +"         " + vote[0] + "          " + percentage_1  );
        System.out.println(" " + Contestants[1] +"         " + vote[1] + "          " + percentage_2  );
        System.out.println(" " + Contestants[2] +"         " + vote[2] + "          " + percentage_3  );
        System.out.println(" " + Contestants[3] +"         " + vote[3] + "          " + percentage_4  );
        System.out.println(" " + Contestants[4] +"         " + vote[4] + "          " + percentage_5  );
        System.out.println(" Total " + "           " + Votes_Total + "        " + percentage_Total );

    }

    if()
}