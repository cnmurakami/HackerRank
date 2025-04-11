class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
        int size = arr.get(0).size();
        int sumA = 0;
        int sumB = 0;
        System.out.println("A");
        for (int i = 0;  i<size; i++){
            System.out.println(arr.get(i).get(i));
            sumA += arr.get(i).get(i);
        }
        System.out.println("B");
        for (int i = 0; i < size; i++) {
            System.out.println(arr.get(i).get(size-1-i));
            sumB += arr.get(i).get(size-1-i);
        }
        return Math.abs(sumA-sumB);
    }

}