class Result {

    /*
     * Complete the 'queensAttack' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER k
     *  3. INTEGER r_q
     *  4. INTEGER c_q
     *  5. 2D_INTEGER_ARRAY obstacles
     */

    public static int queensAttack(int n, int k, int r_q, int c_q, List<List<Integer>> obstacles) {
        // Write your code here
        int possibleMoves = 0;
        int i = 1;
        boolean canMoveUp = true;
        boolean canMoveDown = true;
        boolean canMoveLeft = true;
        boolean canMoveRight = true;
        boolean canMoveUpRight = true;
        boolean canMoveUpLeft = true;
        boolean canMoveDownRight = true;
        boolean canMoveDownLeft = true;
        while (canMoveUp || canMoveDown || canMoveLeft || canMoveRight || canMoveUpRight || canMoveUpLeft || canMoveDownRight || canMoveDownLeft){
            if (canMoveUp){
                if (obstacles.contains(Arrays.asList(r_q+i, c_q)) || r_q+i>n){
                    canMoveUp = false;
                }
                else{
                    possibleMoves++;
                }
            }
            if (canMoveDown){
                if (obstacles.contains(Arrays.asList(r_q-i, c_q)) || r_q-i < 1){
                    canMoveDown = false;
                }
                else{
                    possibleMoves++;
                }
            }
            if (canMoveLeft){
                if (obstacles.contains(Arrays.asList(r_q, c_q-i)) || c_q-i < 1){
                    canMoveLeft = false;
                }
                else{
                    possibleMoves++;
                }
            }
            if (canMoveRight){
                if (obstacles.contains(Arrays.asList(r_q, c_q+i)) || c_q+i>n){
                    canMoveRight = false;
                }
                else{
                    possibleMoves++;
                }
            }
            if (canMoveUpRight){
                if (obstacles.contains(Arrays.asList(r_q+i, c_q+i)) || r_q+i > n || c_q+i > n){
                    canMoveUpRight = false;
                }
                else{
                    possibleMoves++;
                }
            }
            if (canMoveUpLeft){
                if (obstacles.contains(Arrays.asList(r_q+i, c_q-i)) || r_q+i > n || c_q-i < 1){
                    canMoveUpLeft = false;
                }
                else{
                    possibleMoves++;
                }
            }
            if (canMoveDownRight){
                if (obstacles.contains(Arrays.asList(r_q-i, c_q+i)) || r_q-i < 1 || c_q+i > n){
                    canMoveDownRight = false;
                }
                else{
                    possibleMoves++;
                }
            }
            if (canMoveDownLeft){
                if (obstacles.contains(Arrays.asList(r_q-i, c_q-i)) || r_q-i < 1 || c_q-i < 1){
                    canMoveDownLeft = false;
                }
                else{
                    possibleMoves++;
                }
            }
            i++;
        }
        return possibleMoves;
    }

}
