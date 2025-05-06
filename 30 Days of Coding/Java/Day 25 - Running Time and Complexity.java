import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long tests = scan.nextLong();
        for (long i = 0; i<tests; i++){
            long testCase = scan.nextLong();
            if (testCase < 2){
                System.out.println("Not prime");
                continue;
            }
            if (testCase > 3 && (testCase % 2 == 0  || testCase % 3 == 0)) {
                System.out.println("Not prime");
                continue;
            }
            long squareRoot = (long) Math.sqrt(testCase);
            boolean isPrime = true;
            for (long j=3; j<=squareRoot; j++){
                if (testCase % j == 0){
                    System.out.println("Not prime");
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("Prime");
            }
        }
    }
}
