class Result {

    /*
     * Complete the 'strangeCounter' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER t as parameter.
     */

    public static long strangeCounter(long t) {
        long cycleStart = 3;
        
        while (t > cycleStart) {
            t -= cycleStart;
            cycleStart *= 2;
        }
        
        return cycleStart - t + 1;
    }

}