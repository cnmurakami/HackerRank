class Result {

    /*
     * Complete the 'beautifulTriplets' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER d
     *  2. INTEGER_ARRAY arr
     */

    public static int beautifulTriplets(int d, List<Integer> arr) {
        // Write your code here
        int result = 0;
        for (int i = 0; i<arr.size()-2; i++){
            for (int j = i+1; j<arr.size()-1; j++){
                int difference = arr.get(j) - arr.get(i);
                if (difference != d){continue;}
                for (int k = j+1; k<arr.size(); k++){
                    if (arr.get(k) - arr.get(j) == difference){
                        result++;
                    }
                }
            }
        }
        return result;
    }

}