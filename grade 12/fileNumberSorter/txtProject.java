package txtFiles;//Pros:
//Sorting the code from least to greatest is simple
//Does not use a Try Catch Exception
//Only uses one Array List

//Cons:
//Much slower than Hash Map
//The method for finding the smallest number is convoluted and complicated
//Needs multiple read through's of the code
//Uses an array, which limits use

import java.io.FileReader;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class txtProject {
    public static void main(String[] args) throws Exception {
        FileReader fr;
        String fileName;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your file name: ");

        fileName = scan.nextLine();
        long start = System.currentTimeMillis();
        fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);
        int File1List = 0;
        int ArrayLength;
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Boolean ties = false;

        int num = 0;
        String Line;
        int minFrequency = 0;
        String Location = "";
        do {
            Line = br.readLine();
            if (Line != null) {
                num = Integer.parseInt(Line);
                numbers.add(num);
                File1List++;
            }
        } while (Line != null);
        Collections.sort(numbers);
        ArrayLength = (numbers.get(numbers.size() - 1)) + 1;
        int[] numList = new int[ArrayLength];
        for (int i = 0; i < numbers.size(); i++) {
            numList[numbers.get(i)]++;
        }
        minFrequency = numList[0];
        for (int i = 0; i < numList.length; i++) {
            if (numList[i] != 0 && (numList[i] < minFrequency || minFrequency == 0)) {
                minFrequency = numList[i];
                Location = "" + i;
            } else if (numList[i] == minFrequency) {
                Location = Location + " & " + i;
            }
        }
        System.out.println("Number " + Location + " appears " + minFrequency + " times");
        long end = System.currentTimeMillis();
        long timePast = end - start;
        System.out.println("The program takes "+timePast+ " Miliseconds");
    }
}