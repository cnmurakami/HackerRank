class Result {

    /*
     * Complete the 'countApplesAndOranges' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER s
     *  2. INTEGER t
     *  3. INTEGER a
     *  4. INTEGER b
     *  5. INTEGER_ARRAY apples
     *  6. INTEGER_ARRAY oranges
     */

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        int appleCount = 0;
        int orangeCount = 0;
        for (int i = 0; i<apples.size(); i++){
            if (apples.get(i)+a >= s && apples.get(i)+a <= t){
                appleCount++;
            }
        }
        for (int i = 0; i<oranges.size(); i++){
            if (b+oranges.get(i) >= s && b+oranges.get(i) <= t){
                orangeCount++;
            }
        }
        System.out.println(appleCount);
        System.out.println(orangeCount);
    }

}