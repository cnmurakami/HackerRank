class Result {

    /*
     * Complete the 'happyLadybugs' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING b as parameter.
     */

    public static String happyLadybugs(String b) {
        // Write your code here
        boolean happy = true;
        boolean canMove = false;
        char[] board = b.toCharArray();
        HashMap<Character,Integer> ladybugs = new HashMap<>();
        for (char c:board){
            if (ladybugs.containsKey(c)){
                ladybugs.replace(c, ladybugs.get(c)+1);
            }
            else{
                ladybugs.put(c, 1);
            }
        }
        for (char c : ladybugs.keySet()){
            if (c == '_'){
                canMove = true;
            }
            else if (ladybugs.get(c) < 2){
                happy = false;
                return "NO";
            }
        }
        if (!happy && !canMove){
            return "NO";
        }
        if (happy && !canMove){
            for (int i = 0; i<board.length;){
                for (int j = 0; j < ladybugs.get(board[i]); j++){
                    if (board[i+j] != board[i]){
                        return "NO";
                    }
                }
                i+=ladybugs.get(board[i]);
            }
        }
        return "YES";
    }

}