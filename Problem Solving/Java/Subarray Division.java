class Result {

    /*
     * Complete the 'birthday' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY s
     *  2. INTEGER d
     *  3. INTEGER m
     */

    public static int birthday(List<Integer> s, int d, int m) {
        int result = 0;
        if (s.size() == 1 && m == 1 && s.get(0) == d){return 1;}
        for (int i = 0; i < s.size()-m+1 ; i++){
            int sum = 0;
            for (int j = 0; j<m; j++){
                sum += s.get(i+j);
                System.out.println("i: "+i+" j: "+j+" soma: "+sum);
                if (sum>d){break;}
            }
            if (sum == d){result++;}
        }
        return result;
    }

}