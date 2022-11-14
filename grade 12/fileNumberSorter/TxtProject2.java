package txtFiles;//Pros:
//The hash map is much faster
//Only needs to run through the list one time when counting
//Appending to the map is much easier then appending to an Array List

//Cons:
//Much harder to do ties, as there is no practical way to call the keys numbers, only the numbers ascribed to them
//To find the least appearing number, you need an array list as well, so the Hash Map only saves you one read through the code
//It was difficult to learn the Syntax for Hash Maps
// Has to use a Try Catch Exception, which is complicated to understand
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;


public class TxtProject2 {
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
        ArrayList<Integer> LeastNum = new ArrayList<Integer>();
        HashMap<Integer, Integer> numList = new HashMap<Integer, Integer>();
        int num = 0;
        String Line;
        int lowestNum = 0;

        do {
            Line = br.readLine();
            if (Line != null) {
                num = Integer.parseInt(Line);
                try {
                    numList.put(num, numList.get(num) + 1);
                } catch (Exception e) {
                    numList.put(num, 1);
                }
                File1List++;
            }
        } while (Line != null);

        lowestNum = num;
        for (Integer i : numList.keySet()) {
            if (i < lowestNum) {
                lowestNum = i;
            }
        }
        LeastNum.add(num);
        for (int i = lowestNum; i < numList.size() + lowestNum; i++) {
            try {
                if (numList.get(i) < numList.get(LeastNum.get(0))) {
                    LeastNum.clear();
                    LeastNum.add(i);

                } else if (numList.get(i).equals(numList.get(LeastNum.get(0)))) {
                    LeastNum.add(i);
                }
            } catch (Exception e) {

            }
        }
        System.out.println("Number " + LeastNum + " appears " + numList.get(LeastNum.get(0)) + " times");
        long end = System.currentTimeMillis();
        long timePast = end - start;
        System.out.println("The program takes " + timePast + " Miliseconds");
    }
}