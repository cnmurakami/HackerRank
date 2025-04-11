class Result {

    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static int countingValleys(int steps, String path) {
        int level = 0;
        boolean atValley = false;
        int valleyCount = 0;
        for (int c = 0; c<path.length(); c++){
            if (String.valueOf(path.charAt(c)).equals("D")){
                level--;
            }
            else {
                level++;
            }
            if (level >= 0){
                atValley = false;
            }
            if (!atValley && level < 0){
                atValley = true;
                valleyCount++;
            }
            
        }
        return valleyCount;
    }

}