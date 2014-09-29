import java.io.*;
import java.util.*;
import java.text.*;

import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

public class Solution {

    static int anagramCost(String str1, String str2) {
    
        Map<Character, Integer> alphaCount = new HashMap<Character, Integer>();
        int count=0;
        int cost=0;
        int commonCharCount=0;


        for (int i=0;i<str1.length();i++) {
            char ch = str1.charAt(i);
            if(alphaCount.containsKey(ch)) {
                count = alphaCount.get(ch);
                alphaCount.put(ch,count+1);
            } else {
                alphaCount.put(ch,1);
            }
        }

        for (int i=0;i<str2.length();i++) {
            char ch = str2.charAt(i);
            if(alphaCount.containsKey(ch) && alphaCount.get(ch)>0) {
                count = alphaCount.get(ch);
                alphaCount.put(ch, count-1);
                commonCharCount++;
            } else {
                cost++;
            }
        }

        cost+=str1.length()-commonCharCount;

        return cost;

    }



	public static void main (String[] args) {

        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();    
        String str2 = in.nextLine();    
            
        System.out.println(anagramCost(str1,str2));

        in.close();
	}
}