class Result {

    /*
     * Complete the 'extraLongFactorials' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void extraLongFactorials(int n) {
        // Write your code here
        BigInteger result = BigInteger.valueOf(n);
        for (int i = n-1; i>1; i--){
            BigInteger _i = BigInteger.valueOf(i);
            result = result.multiply(_i);
        }
        System.out.println(result);
    }

}