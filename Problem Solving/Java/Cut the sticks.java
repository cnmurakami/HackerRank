class Result {

    /*
     * Complete the 'cutTheSticks' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> cutTheSticks(List<Integer> arr) {
        // Write your code here
        List<Integer> sticksCut = new ArrayList<>();
        while (arr.size()>0) {
            sticksCut.add(arr.size());
            int cutSize = arr.stream().mapToInt(k -> k).min().getAsInt();
            List<Integer> toRemove = new ArrayList<>();
            for (int i = 0; i<arr.size(); i++){
                arr.set(i, arr.get(i)-cutSize);
                if (arr.get(i) <= 0){
                    toRemove.add(arr.get(i));
                }
            }
            arr.removeAll(toRemove);
        }
        return sticksCut;
    }

}