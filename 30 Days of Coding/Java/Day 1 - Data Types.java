import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int myInt = 4;
        double myDouble = 4;
        String myString = "HackerRank ";
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        String s = scan.next()+scan.nextLine();
        System.out.println(myInt + i);
        System.out.println(String.format("%.1f", myDouble + d));
        System.out.println(myString + s);
    }
}
