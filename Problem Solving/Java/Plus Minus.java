class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        double positives = 0;
        double negatives = 0;
        double zeroes = 0;
        for (int e :  arr){
            if (e>0){
                positives++;
            }
            else if (e<0){
                negatives++;
            }
            else{
                zeroes++;
            }
        }
        System.out.printf("%.6f%n", positives/arr.size());
        System.out.printf("%.6f%n", negatives/arr.size());
        System.out.printf("%.6f%n", zeroes/arr.size());
    }

}