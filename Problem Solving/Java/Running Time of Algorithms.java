class Result {

    /*
     * Complete the 'runningTime' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int runningTime(List<Integer> arr) {
        // Write your code here
        int shifts = 0;
        for (int j=1; j<arr.size(); j++){
            int unsorted = arr.get(j);
            int newpos = -1;
            for (int i = j-1; i>=0; i--) {
                if (arr.get(i)>unsorted){
                    newpos = i;
                    shifts++;
                }
            }
            if (newpos != -1){
                arr.remove(j);
                arr.add(newpos, unsorted);
            }
        }
        return shifts;
    }

}