class Result {

    /*
     * Complete the 'insertionSort1' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY arr
     */

    public static void insertionSort1(int n, List<Integer> arr) {
        // Write your code here
        int unsorted = arr.get(arr.size()-1);
        arr.set(arr.size()-1, arr.get(arr.size()-2));
        for (int i = arr.size()-1; i>=0; i--) {
            if (i == 0 || (arr.get(i-1)<unsorted && arr.get(i+1)>unsorted)){
                arr.set(i, unsorted);
                break;
            }
            else{
                arr.set(i, arr.get(i-1));
            }
            showArray(arr);
        }
        showArray(arr);
    }
    public static void showArray(List<Integer> arr){
        String print = "";
        for (int e:arr){
            print+= e + " ";
        }
        System.out.println(print.trim());
    }

}