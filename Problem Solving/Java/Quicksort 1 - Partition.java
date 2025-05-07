class Result {

    /*
     * Complete the 'quickSort' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> quickSort(List<Integer> arr) {
        // Write your code here
        List<Integer> left = new ArrayList<>();
        List<Integer> mid = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        int p = arr.get(0);
        mid.add(p);
        for (int i=1; i<arr.size(); i++){
            if (arr.get(i) == p){
                mid.add(arr.get(i));
            }
            else if (arr.get(i) < p){
                left.add(arr.get(i));
            }
            else{
                right.add(arr.get(i));
            }
        }
        result = Stream.concat(left.stream(), mid.stream()).collect(Collectors.toList());
        result = Stream.concat(result.stream(), right.stream()).collect(Collectors.toList());
        return result;
    }

}