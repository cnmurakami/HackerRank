public class Solution {

    /*
     * Complete the getMoneySpent function below.
     */
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        ArrayList<Integer> sums = new ArrayList<>();
        for (int i:keyboards){
            for (int j:drives){
                if (i+j <= b){
                    sums.add(i+j);
                }
            }
        }
        if (sums.size()>0){return Collections.max(sums);}
        else {return -1;}
    }
}
