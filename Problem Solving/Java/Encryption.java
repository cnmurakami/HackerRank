class Result {

    /*
     * Complete the 'encryption' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String encryption(String s) {
        // Write your code here
        s = s.replaceAll("\\s+", "");
        double L = Math.sqrt(s.length());
        int rows = (int) Math.floor(L);
        int cols = (int) Math.ceil(L);
        while (rows*cols < s.length()){
            rows+=1;
        }
        List<String> grid = new ArrayList<>();
        for (int i = 1; i < rows; i++){
            grid.add(s.substring(0, cols));
            s = s.substring(cols, s.length());
        }
        grid.add(s);
        
        String result = "";
        for (int i = 0; i < cols; i++){
            String tempResult = "";
            for (int j = 0; j < rows; j++){
                try{
                    tempResult += String.valueOf(grid.get(j).charAt(i));
                }
                catch (Exception e){
                }
            }
            result+= tempResult + " ";
        }
        return result.strip();
    }

}