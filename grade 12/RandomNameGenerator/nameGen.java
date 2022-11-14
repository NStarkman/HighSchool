package Lists;

import java.util.Scanner;
public class NameGenerator {
    public static void main(String[] args) {
        String [][] mdaStrArray = {{"Iron", "Captain", "Black", "Doctor", "Spider", "Ms." ,"She", "Moon", "Ghost", "Dead", "Professor", "Scarlet", "War", "Winter", "Star"}, {"Man", "America", "Strange", "Marvel", "Hulk", "Rider","Knight", "X", "Widow", "Pool"}};
        String FirstName;
        String LastName;
        Scanner scan = new Scanner(System.in);
        System.out.println("Input your first name (No spaces or special characters): ");
        FirstName = scan.next();
        int letter = 0;
        int FNLength = FirstName.length();
        int sum = 0;
        do {
            char substring = FirstName.charAt(letter);
            int position = substring - 'a' + 1;
            if (position <= -6){
                position += 32;
            }
            letter += 1;
            sum = sum + position;
        }
        while (letter < FNLength) ;
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Input your last name (No spaces or special characters): ");
        LastName = scan2.next();
        int letter2 = 0;
        int LNLength = LastName.length();
        int sum2 = 0;
        do {
            char ch2 = LastName.charAt(letter2);
            int position2 = ch2 - 'a' + 1;
            if (position2 <= -6) {
                position2 += 32;
            }
            letter2 += 1;
            sum2 += position2;
        }
        while (letter2<LNLength);
        int FirstNamePos = sum % 15;
        int LastNamePos = sum2 % 10;
        System.out.println("Your Marvel Super Hero Name is : "+mdaStrArray[0][FirstNamePos] + " "+ mdaStrArray[1][LastNamePos]);
    }
}
