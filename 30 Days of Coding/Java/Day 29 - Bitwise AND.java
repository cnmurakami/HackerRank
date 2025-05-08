class Result {

    /*
     * Complete the 'bitwiseAnd' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER N
     *  2. INTEGER K
     */

    public static int bitwiseAnd(int N, int K) {
        // Write your code here
        int maximum = 0;
    
        for (int i = 1; i <= N; i++) {
            for (int j = i + 1; j <= N; j++) {
                int bitWise = i & j;
                if (bitWise > maximum && bitWise < K) {
                    maximum = bitWise;
                }
            }
        }
        return maximum;
    }

}