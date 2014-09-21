import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    // make changes on either side of string. hence abs.
    public static int palindromicCost(String line) {
        int len = line.length();
        int totalCost=0;

        for (int i=0;i<len/2;i++) {
            if(line.charAt(i) != line.charAt(len-1-i)) {
                int cost = (int) (line.charAt(len-1-i) - line.charAt(i));
                totalCost+=Math.abs(cost);
            }
        }

        return totalCost;
    }



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numTestCases;

        numTestCases = Integer.parseInt(in.nextLine());    
        
        for (int i=0;i<numTestCases;i++ ) {
            String inputString = in.nextLine();
            int ans = palindromicCost(inputString);
            System.out.println(ans);
        }
        
        in.close();

        
    }
}

