class Result {

    /*
     * Complete the 'minimumDistances' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int minimumDistances(List<Integer> a) {
        // Write your code here
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int i:a){
            if (countMap.containsKey(i)){
                countMap.replace(i, countMap.get(i), countMap.get(i)+1);
            }
            else{
                countMap.put(i, 1);
            }
        }
        int abs = -1;
        for (int i:countMap.keySet()){
            if (countMap.get(i)==2){
                int difference = a.lastIndexOf(i) - a.indexOf(i);
                if (abs == -1 || difference < abs){
                    abs = difference;
                }
            }
        }
        return abs;
    }

}