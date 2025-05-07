class Result {

    /*
     * Complete the 'hackerrankInString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String hackerrankInString(String s) {
        // Write your code here
        String query = "hackerrank";
        int queryPos = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == query.charAt(queryPos)){
                queryPos++;
                if (queryPos >= query.length()){
                    return "YES";
                }
            }
        }
        return "NO";
    }

}