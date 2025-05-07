class Result {

    /*
     * Complete the 'reverseArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static List<Integer> reverseArray(List<Integer> a) {
        // Write your code here
        List<Integer> reversed = new ArrayList<>();
        for (int i = a.size()-1; i>=0; i--){
            reversed.add(a.get(i));
        }
        return reversed;

    }

}