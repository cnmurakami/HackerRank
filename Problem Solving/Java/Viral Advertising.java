class Result {

    /*
     * Complete the 'viralAdvertising' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int viralAdvertising(int n) {
        // Write your code here
        int cumulative = 0;
        int shared = 5;
        for (int i=0; i<n; i++){
            int liked = Math.floorDiv(shared, 2);
            cumulative += liked;
            shared = liked * 3;
        }
        return cumulative;
    }

}