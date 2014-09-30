import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int MAX_NUM = 100;
        int runningTotal=0;
        Scanner stdin=new Scanner(System.in);
        int sizeOfInput=stdin.nextInt();
        int[] inputNumberSet=new int[MAX_NUM];
        for(int i=0;i<sizeOfInput;i++) {
        	inputNumberSet[stdin.nextInt()]++;
            String ignoreStr = stdin.nextLine();
        }
        
        //System.out.println(Arrays.toString(inputNumberSet));
        
        for(int i=0;i<MAX_NUM;i++) {
            runningTotal+=inputNumberSet[i];
            System.out.print(runningTotal+" ");
        }
    }
}