import java.io.*;
import java.util.*;
import java.text.*;

import java.util.Arrays;

public class Solution {

	static int countGemStones(String[] rocks) {
		int numRocks = rocks.length;
		int NUM_ALPHABETS=26;
		int[] charId = new int[NUM_ALPHABETS];
		int OFFSET=97;
		int count=0;

		Arrays.fill(charId,-1);
		for (int i=0;i<numRocks;i++) {
			for(int j=0;j<rocks[i].length();j++) {
				int idx = (int)rocks[i].charAt(j)-OFFSET;
				if(charId[idx] == i-1)
					charId[idx] = i;

				}
			}

		for (int i=0;i<NUM_ALPHABETS;i++) {
			if(charId[i]==(numRocks-1)) {
				count++;
			}
		}	
		return count;
		
	}

	public static void main (String[] args) {

        Scanner in = new Scanner(System.in);
        int numRocks = Integer.parseInt(in.nextLine());
        String[] rocks = new String[numRocks];
        int i=0;
        while(numRocks >0) {
            String inputLine = in.nextLine();    
            rocks[i]=inputLine;	
            i++;
            numRocks--;
        }

        System.out.println(countGemStones(rocks));

        in.close();
	}
}