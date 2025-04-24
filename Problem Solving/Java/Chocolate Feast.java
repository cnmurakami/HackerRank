class Result {

    /*
     * Complete the 'chocolateFeast' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER c
     *  3. INTEGER m
     */

    public static int chocolateFeast(int n, int c, int m) {
        // Write your code here
        int barCount = 0;
        int rest = 0;
        barCount+= Math.floorDiv(n, c);
        rest = barCount;
        while (rest>=m){
            int newBars = Math.floorDiv(rest, m);
            rest-= newBars*m;
            barCount+=newBars;
            rest+=newBars;
        }
        return barCount;
    }

}