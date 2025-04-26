class Result {

    /*
     * Complete the 'stones' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER a
     *  3. INTEGER b
     */

    public static List<Integer> stones(int n, int a, int b) {
        // Write your code here
        List<Integer> results = new ArrayList<>();
        HashSet<Integer> currentValues = new HashSet<>();
        currentValues.add(a);
        currentValues.add(b);
        for (int i = 1; i < n-1 ; i++){
            HashSet<Integer> newValues = new HashSet<>();
            for (int j:currentValues){
                newValues.add(j+a);
                newValues.add(j+b);
            }
            currentValues.clear();
            currentValues.addAll(newValues);
        }
        results.addAll(currentValues);
        Collections.sort(results);
        return results;
    }

}