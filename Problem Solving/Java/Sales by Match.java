class Result {

    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public static int sockMerchant(int n, List<Integer> ar) {
    // Write your code here
        HashMap<Integer,Integer> colors = new HashMap<>();
        for (Integer e: ar){
            if (colors.containsKey(e)){
                colors.replace(e, colors.get(e)+1);
            }
            else{
                colors.put(e, 1);
            }
        }
        int pairs = 0;
        for (Integer e : colors.values()){
            pairs += Math.floorDiv(e, 2);
        }
        return pairs;
    }

}