import java.io.*;
import java.util.*;

public class Solution {

    static int chocolateCount(String[] input) {
        int money = Integer.parseInt(input[0]); // N
        int cost = Integer.parseInt(input[1]); // C
        int wrappersForChoc = Integer.parseInt(input[2]); // N

        int count=0;

        int chocolates = money/cost;
        int wrappers = chocolates;
        int discountedChoc;
        int leftOverWrappers=0;

        while (wrappers >= wrappersForChoc) {
            
            leftOverWrappers = wrappers%wrappersForChoc;
            discountedChoc = wrappers/wrappersForChoc;  
            wrappers=discountedChoc;
            wrappers+=leftOverWrappers;
            count+=discountedChoc;
        }
        

        return chocolates+count;
    }

    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        int numTestCases=Integer.parseInt(in.nextLine());

        while(numTestCases > 0) {
            String[] input = in.nextLine().split("\\s");
            //System.out.println(Arrays.toString(input));
            System.out.println(chocolateCount(input));
            numTestCases--;
        }
    
        in.close();
   }

}