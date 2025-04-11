class Result {

    /*
     * Complete the 'divisibleSumPairs' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER k
     *  3. INTEGER_ARRAY ar
     */

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        int pairs = 0;
        for (int i=0; i<ar.size(); i++){
            for (int j = 0; j<ar.size(); j++){
                if (i>=j){continue;}
                if (i==j){continue;}
                if ((ar.get(i) + ar.get(j)) % k !=0){continue;}
                System.out.println("Pair: " + ar.get(i) + " " + ar.get(j) );
                pairs++;
            }
        }
        return pairs;

    }

}