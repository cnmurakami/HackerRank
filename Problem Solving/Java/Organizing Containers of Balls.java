class Result {

    /*
     * Complete the 'organizingContainers' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts 2D_INTEGER_ARRAY container as parameter.
     */

    public static String organizingContainers(List<List<Integer>> container) {
    // Write your code here
        List<Long> colSum = new ArrayList<>();
        for (int i = 0; i < container.get(0).size(); i++){
            long sum = 0;
            for (int j = 0; j< container.size(); j++){
                sum += container.get(j).get(i);
            }
            colSum.add(sum);
        }
        for (int i = 0; i < container.size(); i++){
            long rowSum = container.get(i).stream().mapToLong(v -> v).sum();
            if (colSum.contains(rowSum)) {
                colSum.remove(rowSum);
            }
            else{
                return "Impossible";
            }
        }
        return "Possible";
    }

}