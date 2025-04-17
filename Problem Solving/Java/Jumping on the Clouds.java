class Result {

    /*
     * Complete the 'jumpingOnClouds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY c as parameter.
     */

    public static int jumpingOnClouds(List<Integer> c) {
        // Write your code here
        int jumps = 0;
        for (int i=0; i<c.size(); i+=0){
            if (i<c.size()-2 && c.get(i+2)==0){
                jumps++;
                i+=2;
            }
            else if (i == c.size()-1){
                break;
            }
            else{
                jumps++;
                i+=1;
            }
        }
        return jumps;

    }

}