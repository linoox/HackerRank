import java.io.*;
import java.util.*;
import java.text.*;

import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

/*
Note this condition:
wrong:if(alphaCount.containsKey(ch)) { //process }
correct: if(alphaCount.containsKey(ch) && alphaCount.get(ch)>0) { //process }

HashMap will have the key even if the count/value is 0 and then will
start decrementing the count. 
Bug: assumed that after value becomes 0, alphaCount.containsKey(ch) will be false.

*/

public class Solution {

    static int anagramCost(String str) {
        int len = str.length();
        int NOT_ANAGRAM = -1;
        int cost=0;
        int count=0;
        String strOne = str.substring(0,len/2);
        String strTwo = str.substring(len/2,len);
        
        if (strOne.length() != strTwo.length())
            return NOT_ANAGRAM; // -1 not anagram

        Map<Character, Integer> alphaCount = new HashMap<Character, Integer>();

        for (int i=0;i<strOne.length();i++) {
            char ch = strOne.charAt(i);
            if(alphaCount.containsKey(ch)) {
                count = alphaCount.get(ch);
                alphaCount.put(ch,count+1);
            } else {
                alphaCount.put(ch,1);
            }
        }

        for (int i=0;i<strTwo.length();i++) {
            char ch = strTwo.charAt(i);
            if(alphaCount.containsKey(ch) && alphaCount.get(ch)>0) {
                count = alphaCount.get(ch);
                alphaCount.put(ch, count-1);
            } else {
                cost++;
            }
        }

        //System.out.println("alphaCount:"+alphaCount);

        return cost;

    }



	public static void main (String[] args) {

        Scanner in = new Scanner(System.in);
        int numTestCases = Integer.parseInt(in.nextLine());
        while(numTestCases >0) {
            String inputLine = in.nextLine();    
            System.out.println(anagramCost(inputLine));
            numTestCases--;
        }

        in.close();
	}
}
