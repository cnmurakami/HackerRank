class Result {

    /*
     * Complete the 'repeatedString' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. LONG_INTEGER n
     */

    public static long repeatedString(String s, long n) {
        long initialCount = 0;
        long decimal = n % s.length();
        long incomplete = 0;
        for (int i = 0; i<s.length() ; i++) {
            if (s.charAt(i) == 'a'){
                initialCount++;
                if (i< decimal){
                    incomplete++;
                }
            }
        }
        long repeat = Math.floorDiv(n, s.length());
        return initialCount*repeat+incomplete;
    }

}