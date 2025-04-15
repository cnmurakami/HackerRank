class Result {

    /*
     * Complete the 'angryProfessor' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY a
     */

    public static String angryProfessor(int k, List<Integer> a) {
        // Write your code here
        int arrivedOnTime = (int) a.stream().filter(v -> v<=0).count();
        if (arrivedOnTime >= k){
            return "NO";
        }
        else{
            return "YES";
        }
    }

}