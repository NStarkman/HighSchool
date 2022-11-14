package JugGameProject;

import java.util.Scanner;

public class JugGameInterface {
    public JugGameInterface() {
    }
    public static void main(String[] args) throws Exception {
        JugGame JG;
        JG = new JugGame();
        // Sets the jug values to zero
        int From = 0;
        int To = 0;
        boolean badData = true;
        System.out.println("You have 3 jugs: One that hold 8, 5 and 3. The 8 one is full. Can you get two jugs to equal 4?");
        while (!JG.Wins) {
            Scanner sc;
            // do while makes sure that the Try-Catch loops properly each time the input fails
            do {
                sc = new Scanner(System.in);
                System.out.println("Which jug to you want to pour from? (8, 5, 3)");
                // Asks if 'From' is one of the expected values, and if not it repeats
                try {
                    From = sc.nextInt();
                    if (From != 8 && From != 5 && From != 3) {
                        throw new Exception();
                    } else {
                        badData = false;
                    }
                } catch (Exception e) {
                    System.out.println("Did not input the correct data type");
                }
            } while (badData);
            badData = true;
            do {
                sc = new Scanner(System.in);
                // do while makes sure that the Try-Catch loops properly each time the input fails
                System.out.println("Which jug to you want to pour to? (8, 5 3)");
                // Asks if 'To' is one of the expected values, and if not it repeats
                try {
                    To = sc.nextInt();
                    if (To != 8 && To != 5 && To != 3) {
                        throw new Exception();
                    } else {
                        badData = false;
                    }
                } catch (Exception e) {
                    System.out.println("Did not input the correct data type");
                }
            } while (badData);
            //Sends the inputted information back to the 'Pour' Method in JugGame
            JG.pour(From, To);
            System.out.println("it has been " + JG.getMoves() + " Move(s)");
            System.out.println("You poured from the "+From+ " Litre Jug into the "+To+" Litre Jug");
            System.out.println(JG.toString());


        }
        System.out.println("Two Fours! You Win!");
    }
}
