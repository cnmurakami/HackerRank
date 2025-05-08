class Result {

    /*
     * Complete the 'theLoveLetterMystery' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int theLoveLetterMystery(String s) {
        // Write your code here
        int operations = 0;
        for (int i = 0; i < s.length()/2; i++){
            operations += Math.abs(s.charAt(i) - s.charAt(s.length()-1-i));
        }
        return operations;
    }

}