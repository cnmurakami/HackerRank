import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for (int n = 0; n<T; n++) {
            String s = scan.next();
            String even = "";
            String odd = "";
            for (int i = 0; i<s.length(); i++){
                if (i%2 == 0){
                    even+=s.charAt(i);
                }
                else{
                    odd+=s.charAt(i);
                }
            }
            System.out.println(even + " " + odd);
        }
    }
}