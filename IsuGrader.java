import java.util.Scanner;

public class IsuGrader {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double total = 0.0;

        double lowestValue = 10.0;

        double highestValue = 0.0;

        for (int i = 1; i < 10; i ++) {
            // prompt user for judge's score and scan their input
            System.out.println("Please enter judge #" + i + "'s score: ");
            double score = input.nextDouble();

            /*
            // if their input is more than 10, ask again
            if (score > 10.0)  {
                System.out.println("Please enter judge #" + i + "'s score: ");
                score = input.nextDouble();

            }

            // if their input is less than 0, ask again
            if (score < 0.0) {
                System.out.println("Please enter judge#" + i + "'s score: ");
                score = input.nextDouble();

            }

             */

            while (score < 0 || score > 10) {
                System.out.println("Please enter judge #" + i + "'s score: ");
                score = input.nextDouble();
            }

            // if score is higher than current score, replace highestValue with that score
            if (score > highestValue) {
                highestValue = score;

            }

            // if score is lower than current score, replace lowestValue with that score
            if (score < lowestValue) {
                lowestValue = score;

            }

            // add up the scores
            total += score;

        }

        // subtract highest and lowest scores from total and average it between 7 judges
        total = (total - (lowestValue + highestValue)) / 7;

        // print final score
        System.out.println("Your final score is " + total);


        /* Research questions

            1. Evgenia Medvedeva

           2a. a backward takeoff from the backward inside edge of one skate to the backward outside edge of
               the other, with one or more full turns in the air

            b. jump with a forward take off

            c. a backward takeoff from the backward outside edge of one skate
               to the backward outside edge of the other, with one or more full turns in the air

            3. Brian Boitano
         */
    }
}
