class Result {

    /*
     * Complete the 'saveThePrisoner' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER m
     *  3. INTEGER s
     */

    public static int saveThePrisoner(int n, int m, int s) {
        // Write your code here
        int p = s + m -1;
        int r = p % n;
        if (r == 0) {
            return n;
        }
        else {
            return r;
        }
    }

}