class Result {

    /*
     * Complete the 'cavityMap' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts STRING_ARRAY grid as parameter.
     */

    public static List<String> cavityMap(List<String> grid) {
        // Write your code here
        for (int i = 1; i<grid.size()-1; i++){
            for (int j = 1; j<grid.get(i).length()-1; j++){
                int [] edges = {grid.get(i).charAt(j-1), grid.get(i).charAt(j+1), grid.get(i-1).charAt(j), grid.get(i+1).charAt(j)};
                int maxEdge = Arrays.stream(edges).max().getAsInt();
                if (grid.get(i).charAt(j) > maxEdge){
                    char[] newLine = grid.get(i).toCharArray();
                    newLine[j] = 'X';
                    grid.set(i, new String(newLine));
                }
            }
        }
        return grid;
    }
