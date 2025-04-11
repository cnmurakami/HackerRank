class Result {

    /*
     * Complete the 'migratoryBirds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int migratoryBirds(List<Integer> arr) {
    HashMap<Integer,Integer> id = new HashMap<>();
        for (Integer e: arr){
            if (id.containsKey(e)) {
                id.replace(e, id.get(e), id.get(e)+1);
            }
            else {
                id.put(e, 1);
            }
        }
        int max = 0;
        int mostCommon = 0;
        for (Integer e: id.keySet()){
            if (id.get(e)>max){
                max = id.get(e);
                mostCommon = e;
            }
        }
        return mostCommon;
    }

}