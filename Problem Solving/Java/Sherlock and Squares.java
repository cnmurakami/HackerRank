class Result {

    /*
     * Complete the 'squares' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER a
     *  2. INTEGER b
     */

    public static int squares(int a, int b) {
        // Write your code here
        int squares = 0;
        int initialSquare = 0;
        for (int i = a; i<=b; i++){
            if (Math.sqrt(i) % 1 == 0){
                initialSquare = (int)Math.sqrt(i);
                System.out.println(initialSquare);
                break;
            }
        }
        if (initialSquare == 0) {return 0;}
        for (int i = initialSquare; i<=b; i++){
            if (i*i > b){
                break;
            }
            else{
                squares++;
            }
        }
        return squares;

    }

}