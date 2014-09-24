import java.io.*;
import java.util.*;
import java.text.*;

public class Solution {

    static String isPangram(String str) {
        int UPPEROFFSET = 65;
        int LOWEROFFSET = 97;
        int NUM_OF_ALPHABETS=26;
        int index=0;
        int[] digitCount = new int[NUM_OF_ALPHABETS];
        String output="";

        for (int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
        
            if (ch >= 65 && ch <= 90) {
                index = ch-UPPEROFFSET;
                digitCount[index]+=1;
            }  else if (ch >= 97 && ch <= 122) {
                index = ch-LOWEROFFSET;
                digitCount[index]+=1;
            }
        }
        
        //System.out.println(Arrays.toString(digitCount));

        // list of missing characters
        for (int j=0;j<NUM_OF_ALPHABETS;j++) {
            if(digitCount[j] == 0) {
                output += (char) (j+LOWEROFFSET);
            }
        }

        if(output.equals("")) {
            return "pangram";
        } else {
            return "not pangram";// return output for list of missing alphabets 
        }

    }



	public static void main (String[] args) {

        Scanner in = new Scanner(System.in);
        String inputLine = in.nextLine();
        System.out.println(isPangram(inputLine));

        in.close();
	}
}
