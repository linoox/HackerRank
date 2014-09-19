import java.io.*;
import java.util.*;

public class Solution {

    static int exactlyDivides(int originalNumber) {
        int count = 0;
        int digit = 0;
        int number = originalNumber;

        while (number != 0) {
            digit = number % 10;
            if(digit != 0) {
                if (originalNumber % digit == 0) {
                    count++;
                }   
            }
            number = number / 10;
        }
        return count;
   }

   
 public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int _a;
        _a = in.nextInt();
        int[] testcases = new int[_a];
        int _b;
        int count;

        for (int i=0;i<_a;i++ ) {
            _b = in.nextInt();
            testcases[i]=_b;
        }
            
        for (int j=0;j<_a;j++) {
            count = exactlyDivides(testcases[j]);
            System.out.println(count);    
        }
   }

}