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

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        List<List<Integer>> newArr = new ArrayList<>();
        for (int i = 0; i<arr.size()-2; i++){
            for (int j = 0; j<arr.get(i).size()-2; j++){
                List<Integer> hourGlass = new ArrayList<>();
                for (int k = 0; k <= 2; k++){
                    hourGlass.add(arr.get(i).get(j+k));
                }
                hourGlass.add(arr.get(i+1).get(j+1));
                for (int k = 0; k <= 2; k++){
                    hourGlass.add(arr.get(i+2).get(j+k));
                }
                newArr.add(hourGlass);
            }
        }
        System.out.println(
            newArr.stream().map(v -> v.stream().reduce(0, (a, b) -> a + b)).max(Integer::compare).get()
            );
    }
}
