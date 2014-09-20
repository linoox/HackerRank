import java.io.*;
import java.util.*;

public class Solution {

    static long maxPieces(long numOfCuts) {

        if(numOfCuts%2 == 0) {
            return numOfCuts*numOfCuts/4;
        } else {
            return (numOfCuts/2)*(numOfCuts/2)+numOfCuts/2;    
        }
    }

   
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int _a;
        _a = in.nextInt();
        long[] testcases = new long[_a];
        long _b;
        long count;

        for (int i=0;i<_a;i++ ) {
            _b = in.nextInt();
            testcases[i]=_b;
        }
            
        for (int j=0;j<_a;j++) {
            count = maxPieces(testcases[j]);
            System.out.println(count);    
        }
   }

}