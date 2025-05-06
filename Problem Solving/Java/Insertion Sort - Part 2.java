class Result {

    /*
     * Complete the 'insertionSort2' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY arr
     */

    public static void insertionSort2(int n, List<Integer> arr) {
        // Write your code here
        for (int j=1; j<arr.size(); j++){
            int unsorted = arr.get(j);
            int newpos = -1;
            for (int i = j-1; i>=0; i--) {
                if (arr.get(i)>unsorted){
                    newpos = i;
                }
            }
            if (newpos != -1){
                arr.remove(j);
                arr.add(newpos, unsorted);
            }
            showArray(arr);
        }
    }
    
    public static void showArray(List<Integer> arr){
        String print = "";
        for (int e:arr){
            print+= e + " ";
        }
        System.out.println(print.trim());
    }

}