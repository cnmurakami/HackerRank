import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Hello, World.");
        try{
            System.out.println(br.readLine());
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
}
