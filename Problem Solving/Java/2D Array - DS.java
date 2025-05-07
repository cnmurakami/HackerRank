class Result {

    /*
     * Complete the 'hourglassSum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int hourglassSum(List<List<Integer>> arr) {
        // Write your code here
        List<List<Integer>> newArr = new ArrayList<>();
        for (int i = 0; i<arr.size()-2; i++){
            for (int j = 0; j<arr.get(i).size()-2; j++){
                List<Integer> hourGlass = new ArrayList<>();
                for (int k = 0; k <= 2; k++){
                    hourGlass.add(arr.get(i).get(j+k));
                }
                hourGlass.add(arr.get(i+1).get(j+1));
                for (int k = 0; k <= 2; k++){
                    hourGlass.add(arr.get(i+2).get(j+k));
                }
                newArr.add(hourGlass);
            }
        }
        return newArr.stream().map(v -> v.stream().reduce(0, (a, b) -> a + b)).max(Integer::compare).get();
    }

}