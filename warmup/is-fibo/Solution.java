import java.io.*;
import java.util.*;

public class Solution {

	static boolean isPerfectSquare(int num) {
		double i = Math.sqrt(num);
		return (i*i == num);
	}

	static boolean isFibo(int n) {

		return isPerfectSquare(5*n*n + 4) || isPerfectSquare(5*n*n - 4);
	}



	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
        int numTestCases;

        numTestCases = in.nextInt();    
        
        for (int i=0;i<numTestCases;i++ ) {
            int input = in.nextInt();
            if(isFibo(input)) {
            	System.out.println("IsFibo");	
            } else {
            	System.out.println("IsNotFibo");
            }
            
            
        }
        
        in.close();
        
	}
}