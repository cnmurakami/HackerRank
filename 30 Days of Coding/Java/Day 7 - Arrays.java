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

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        bufferedReader.close();
        
        //Solution
        List<Integer> _arr = new ArrayList<>();
        for (int i = arr.size()-1; i>=0; i--){
            _arr.add(arr.get(i));
        }
        _arr.stream().mapToInt(v -> v).forEach(s -> {
            if (_arr.indexOf(s) < _arr.size()-1){System.out.print(s+" ");}
            else{System.out.print(s);}
            });
    }
}
