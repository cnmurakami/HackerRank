import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
        
        String binary = "";
        while (n > 0){
            binary = n%2 + binary;
            n = Math.floorDiv(n, 2);
        }
        int max = 0;
        int current = 0;
        for (int i = 0; i<binary.length(); i++){
            if (binary.charAt(i)=='0'){
                if (current > max){
                    max = current;
                }
                current = 0;
            }
            else{
                current++;
            }
        }
        if (current>max){
            System.out.println(current);
        }
        else {
            System.out.println(max);
        }
    }
}
