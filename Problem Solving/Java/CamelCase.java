class Result {

    /*
     * Complete the 'camelcase' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int camelcase(String s) {
        // Write your code here
        int wordCount = s.length()>0 ? 1 : 0;
        Pattern pattern = Pattern.compile("[A-Z]");
        Matcher matcher = pattern.matcher(s);
        wordCount += matcher.results().count();
        return wordCount;
    }

}