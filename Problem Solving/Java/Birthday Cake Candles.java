class Result {

    /*
     * Complete the 'birthdayCakeCandles' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY candles as parameter.
     */

    public static int birthdayCakeCandles(List<Integer> candles) {
        int tallest = candles.get(0);
        for (int i : candles){
            if (i > tallest){
                tallest = i;
            }
        }
        int sum = 0;
        for (int i=0; i<candles.size(); i++){
            if (candles.get(i) == tallest){
                sum ++;
            }
        }
        return sum;
    }

}