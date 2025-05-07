class Result {

    /*
     * Complete the 'arrayManipulation' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. 2D_INTEGER_ARRAY queries
     */

    public static long arrayManipulation(int n, List<List<Integer>> queries) {
        // Write your code here
        long[] arr = new long[n + 2];

        for (List<Integer> query : queries) {
            arr[query.get(0)] += query.get(2);
            arr[query.get(1) + 1] -= query.get(2);
        }

        long max = 0;
        long current = 0;
        for (int i = 1; i <= n; i++) {
            current += arr[i];
            if (current > max) {
                max = current;
            }
        }

        return max;
    }

}
