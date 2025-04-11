class Result {

    /*
     * Complete the 'hurdleRace' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY height
     */

    public static int hurdleRace(int k, List<Integer> height) {
        int maxHeight = height.stream().mapToInt(v -> v).max().getAsInt();
        if (k>maxHeight) {
            return 0;
        }
        return maxHeight-k;
    }

}