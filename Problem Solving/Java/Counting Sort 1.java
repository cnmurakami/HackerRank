class Result {

    /*
     * Complete the 'countingSort' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> countingSort(List<Integer> arr) {
        // Write your code here
        int[]frequency = new int[100];
        for (int i = 0; i< arr.size(); i++){
            frequency[arr.get(i)]++;
        }
        return Arrays.stream(frequency).boxed().collect(Collectors.toList());
    }

}