class Result {

    /*
     * Complete the 'dynamicArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. 2D_INTEGER_ARRAY queries
     */

    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        // Write your code here
        List<List<Integer>> arr = new ArrayList<>();
        int lastAnswer = 0;
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++){
            arr.add(new ArrayList<>());
        }
        
        for (int i = 0; i < queries.size(); i++) {
            int idx = (queries.get(i).get(1) ^ lastAnswer) % arr.size();
            int y = queries.get(i).get(2);
            if (queries.get(i).get(0) == 1) {
                arr.get(idx).add(y);
            } else {
                int size = arr.get(idx).size();
                lastAnswer = arr.get(idx).get(y%size);
                result.add(lastAnswer);
            }
        }
        return result;
    }

}