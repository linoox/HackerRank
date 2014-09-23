import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        int MAX_NUM = 100;
        Scanner stdin=new Scanner(System.in);
        int sizeOfInput=stdin.nextInt();
        int[] inputNumberSet=new int[MAX_NUM];
        for(int i=0;i<sizeOfInput;i++) 
        	inputNumberSet[stdin.nextInt()]++;
        
        for(int i=0;i<MAX_NUM;i++) {
            System.out.print(inputNumberSet[i]+" ");
        }
    }
}
