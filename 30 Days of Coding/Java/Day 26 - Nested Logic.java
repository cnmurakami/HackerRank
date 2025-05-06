import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
            // Write your code here
            Scanner scan = new Scanner(System.in);
            int d1 = scan.nextInt();
            int m1 = scan.nextInt();
            int y1 = scan.nextInt();
            int d2 = scan.nextInt();
            int m2 = scan.nextInt();
            int y2 = scan.nextInt();
            if (y1 > y2){
                System.out.println(10000);
            }
            else if (y1 == y2 && m1 > m2){
                System.out.println(500 * (m1 - m2));
            }
            else if (y1 == y2 && m1 == m2 && d1 > d2){
                System.out.println(15 * (d1 - d2));
            }
            else{
                System.out.println(0);
            }
    }
}