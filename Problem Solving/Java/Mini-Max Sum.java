class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        long maximumSum = arr.get(0);
        long minimumSum = arr.stream().mapToLong(i -> i.longValue()).sum();
        for (int i = 0; i<arr.size(); i++){
            long sum = 0;
            for (int j = 0; j < arr.size(); j++){
                if (j != i){
                    sum += arr.get(j);
                }
            }
            if (sum > maximumSum){
                maximumSum = sum;
            }
            if (sum < minimumSum){
                minimumSum = sum;
            }
        }
        System.out.println(minimumSum + " " + maximumSum);
    }

}