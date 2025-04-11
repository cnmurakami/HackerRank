class Result {

    /*
     * Complete the 'pageCount' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER p
     */

    public static int pageCount(int n, int p) {
        int additionalPage = 0;
        if (n%2 == 0){
            additionalPage+=1;
            n--;
        }
        int forward;
        if (p%2 == 0) {
            forward = Math.floorDiv(p+1, 2);
        } else {
            forward = Math.floorDiv(p, 2);
        }
        int backward = Math.floorDiv(n-p, 2)+additionalPage;
        
        return Math.min(forward, backward);

    }

}