import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import java.util.Arrays;

public class Solution {

	//mistakes:
	// iterating 2nd time over length of string instead of maplength.
	static String palindromic(String str) {
		int OFFSET=97;
		int alphabetCount=26;
		int[] alphabetCountMap = new int[alphabetCount];
		Arrays.fill(alphabetCountMap,0);
		int len = str.length();
		int unique = 0;

		for (int i=0;i<len;i++) {
			int idx = str.charAt(i) - OFFSET;
			alphabetCountMap[idx]++;
		}

		for (int j=0;j<alphabetCount;j++) {
			
			if (alphabetCountMap[j] % 2 == 1) {
				unique++;
			} 

			if (unique > 1)
				return "NO";
		}

		return "YES";
	}

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        String inputString = myScan.nextLine();
       
        String ans = palindromic(inputString);
        // Assign ans a value of YES or NO, depending on whether or not inputString satisfies the required condition
        System.out.println(ans);
        myScan.close();
    }
}
