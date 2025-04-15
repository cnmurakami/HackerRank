class Result {

    /*
     * Complete the 'circularArrayRotation' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER k
     *  3. INTEGER_ARRAY queries
     */

    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
    // Write your code here
        for (int i = 0; i<k; i++){
            a.add(0, a.get(a.size()-1));
            a.remove(a.size()-1);
        }
        List<Integer> result = new ArrayList<>();
        for (int e: queries){
            result.add(a.get(e));
        }
        return result;
    }

}