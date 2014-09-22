import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static int getPosition(int[] inputNumbers, int V) {
		int NOT_FOUND = Integer.MIN_VALUE;

		for (int i=0;i<inputNumbers.length;i++) {
			if(inputNumbers[i] == V)
				return i;
		}
		return NOT_FOUND;
	}

    public static void main(String[] args) {
        Scanner stdin=new Scanner(System.in);
        int V=stdin.nextInt(),sizeOfInput=stdin.nextInt();
        int inputNumbers[]=new int[sizeOfInput];
        for(int i=0;i<sizeOfInput;i++) 
        	inputNumbers[i]=stdin.nextInt();
        
        int position = getPosition(inputNumbers,V);
        System.out.println(position);
    }
}
