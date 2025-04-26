class Result {

    /*
     * Complete the 'fairRations' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts INTEGER_ARRAY B as parameter.
     */

    public static String fairRations(List<Integer> B) {
    // Write your code here
        if (B.size()<=2) {
            return "NO";
        }
        int [] b = B.stream().mapToInt(i->i).toArray();
        int breads = 0;
        for (int i = 0; i< b.length-1; i++){
            if (b[i]%2 != 0 && i+1<b.length){
                b[i]++;
                b[i+1]++;
                breads++;
            }
        }
        if (b[b.length-1] % 2 == 0) {
            return String.valueOf(breads*2);
        }
        else{
            return "NO";
        }
    }

}