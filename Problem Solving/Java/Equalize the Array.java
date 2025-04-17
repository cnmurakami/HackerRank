class Result {

    /*
     * Complete the 'equalizeArray' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int equalizeArray(List<Integer> arr) {
        // Write your code here
        HashMap<Integer,Integer> intMap = new HashMap<>();
        int highestCount = 0;
        for (Integer i : arr){
            if (intMap.containsKey(i)){
                intMap.replace(i, intMap.get(i)+1);
            }
            else{
                intMap.put(i, 1);
            }
            if (intMap.get(i)>highestCount){
                highestCount = intMap.get(i);
            }
        }
        return arr.size()-highestCount;
    }

}