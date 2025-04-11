class Result {

    /*
     * Complete the 'climbingLeaderboard' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY ranked
     *  2. INTEGER_ARRAY player
     */

    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        List<Integer> positions = new ArrayList<>();
        Set<Integer> uniqueScores = new HashSet<>(ranked);
        List<Integer> orderedList = new ArrayList<>(uniqueScores);
        
        orderedList.sort(Comparator.naturalOrder());
        
        for (int pos : player){
            int rank_index=0;
            
            int index = Collections.binarySearch(orderedList, pos);
                if (index >= 0) {
                    rank_index = orderedList.size()-1-index;
                } else {
                    int insertionPoint = -index - 1;
                    rank_index = orderedList.size()-insertionPoint;
                }
                
            
            positions.add(rank_index+1);
        }
        return positions;
    }

}