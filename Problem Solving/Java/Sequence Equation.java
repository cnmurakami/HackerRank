class Result {

    /*
     * Complete the 'permutationEquation' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY p as parameter.
     */

    public static List<Integer> permutationEquation(List<Integer> p) {
        // Write your code here
        List<Integer> result = new ArrayList<>();
        for (int i=0; i<p.size(); i++) {
            int x = i+1;
            int pX1 = p.indexOf(x)+1;
            int pX2 = p.indexOf(pX1)+1;
            result.add(pX2);
        }
        return result;
    }

}