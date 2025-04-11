class Result {

    /*
     * Complete the 'compareTriplets' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> score = new ArrayList<Integer>();
        Integer sumA = 0;
        Integer sumB = 0;
        for (int i = 0; i<a.size(); i++){
            if (a.get(i) > b.get(i)){
                sumA++;
            }
            else if (a.get(i) < b.get(i)){
                sumB++;
            }
        }
        score.add(sumA);
        score.add(sumB);
        return score;
    }

}