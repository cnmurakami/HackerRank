import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        HashMap<String, String> phoneBook = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        long entries = Long.valueOf(scan.nextLine());
        for (long i = 0; i < entries; i++){
            String newEntry = scan.nextLine();
            String entrySplit[] = newEntry.split(" ");
            phoneBook.put(entrySplit[0], entrySplit[1]);
        }
        
        while(scan.hasNext()){
            String query = scan.nextLine();
            if (phoneBook.containsKey(String.valueOf(query))){
                System.out.println(query+ "=" +phoneBook.get(String.valueOf(query)));
            }
            else{
                System.out.println("Not found");
            }
        }
        scan.close();
    }
}
