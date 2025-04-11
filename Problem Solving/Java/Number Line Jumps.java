class Result {

    /*
     * Complete the 'kangaroo' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER x1
     *  2. INTEGER v1
     *  3. INTEGER x2
     *  4. INTEGER v2
     */

    public static String kangaroo(int x1, int v1, int x2, int v2) {
    // Write your code here
        String primeiro;
        if (x1<x2){
            primeiro = "x1";
        }
        else{
            primeiro = "x2";
        }
        if (primeiro.equals("x1") && v2>=v1){
            return "NO";
        }
        if (primeiro.equals("x2") && v1>=v2){
            return "NO";
        }
        while(true){
            System.out.println("Posicao x1: "+x1);
            System.out.println("Posicao x2: "+x2);
            if (x1 == x2) {
                return "YES";
            }
            x1 += v1;
            x2 += v2;
            if ((primeiro.equals("x1") && x1>x2) || (primeiro.equals("x2") && x2>x1)){
                return "NO";
            }
        }
    }

}