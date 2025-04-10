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

class Result {

    /*
     * Complete the 'pickingNumbers' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int pickingNumbers(List<Integer> a) {
        int maxLen = 0;
        for (int i = 0; i<a.size(); i++){
            int testValue = a.get(i);
            List<Integer> tempArray = new ArrayList<>();
            tempArray.add(testValue);
            for (int j = 0; j<a.size(); j++){
                if (j==i){continue;}
                if (Math.abs(testValue - a.get(j))<=1){
                    tempArray.add(a.get(j));
                }
            }
            boolean candidate=true;
            do{
                candidate = true;
                for (int j = 0; j<tempArray.size(); j++){
                    for (int k = 0; k<tempArray.size(); k++){
                        if (Math.abs(tempArray.get(j) - tempArray.get(k))>1){
                            candidate = false;
                            tempArray.remove(k);
                            break;
                        }
                    }
                    if (!candidate){break;}
                }
            }while(!candidate);
            if (tempArray.size()>maxLen){
                maxLen = tempArray.size();
            }
        }
        return maxLen;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.pickingNumbers(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
