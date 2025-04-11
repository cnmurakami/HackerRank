class Result {

    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int n) {
    // Write your code here
        for (int i = 1; i <= n; i++){
            System.out.println(" ".repeat(n-i) + "#".repeat(i) );
        }
    }

}