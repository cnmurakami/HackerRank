class Result {

    /*
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static int getTotalX(List<Integer> a, List<Integer> b) {
    // Write your code here
        int result = 0;
        for (int i = 1; i<=b.get(0); i++){
            boolean candidato = true;
            for (int j = 0; j<a.size(); j++){
                if (i%a.get(j)!=0) {
                    candidato = false;
                    break;
                }
                System.out.println("Candidato A: "+ i);
            }
            if (!candidato){continue;}
            for (int j = 0; j<b.size(); j++){
                if (b.get(j)%i!=0){
                    candidato = false;
                    break;
                }
                System.out.println("Candidato B: "+ i);
            }
            if (candidato) {
                System.out.println("Passou: "+ i);
                result++;
            }
        }
        return result;

    }

}