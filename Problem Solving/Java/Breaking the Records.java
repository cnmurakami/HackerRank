class Result {

    /*
     * Complete the 'breakingRecords' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY scores as parameter.
     */

    public static List<Integer> breakingRecords(List<Integer> scores) {
        int highest = scores.get(0);
        int lowest = scores.get(0);
        List<Integer> count = new ArrayList<>();
        count.add(0);
        count.add(0);
        for (int i = 1; i<scores.size(); i++){
            if (scores.get(i) > highest) {
                highest = scores.get(i);
                count.set(0, count.get(0) + 1);
            }
            else if (scores.get(i) < lowest) {
                lowest = scores.get(i);
                count.set(1, count.get(1) + 1);
            }
        }
        return count;
    }

}