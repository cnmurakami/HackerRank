class Result {

    /*
     * Complete the 'taumBday' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER b
     *  2. INTEGER w
     *  3. INTEGER bc
     *  4. INTEGER wc
     *  5. INTEGER z
     */

    public static long taumBday(int b, int w, int bc, int wc, int z) {
        // Write your code here
        if (z + wc < bc){
            bc = z + wc;
        }
        else if (z + bc < wc){
            wc = z + bc;
        }
        long bcl = bc;
        long wcl = wc;
        long result = (bcl*b) + (wcl*w);
        return result;
    }
}