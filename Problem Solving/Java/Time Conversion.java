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
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
        String[] time = s.split("(:|AM|PM)");
        String period = s.replaceAll("[0-9]{2}:[0-9]{2}:[0-9]{2}", "");
        if (time[0].equals("12") && period.equals("AM")) {
            time[0] = "00";
        }
        else if (period.equals("PM")){
            time[0] = String.valueOf(Integer.parseInt(time[0])+12);
            if (time[0].equals("24")){
                time[0] = "12";
            }
        }
        String result = "";
        for (String e : time){
            result += e+":";
        }
        result = result.substring(0, result.length()-1);
        return result;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
