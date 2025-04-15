class Result {

    /*
     * Complete the 'beautifulDays' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER i
     *  2. INTEGER j
     *  3. INTEGER k
     */

    public static int beautifulDays(int i, int j, int k) {
    // Write your code here
        int result = 0;
        for (int s = i; s <= j; s++){
            String strReverseDay = new StringBuilder(String.valueOf(s)).reverse().toString();
            int reverseDay = Integer.parseInt(strReverseDay);
            if (Math.abs(s-reverseDay)%k == 0) {
                result++;
            }
        }
        return result;
    }

}