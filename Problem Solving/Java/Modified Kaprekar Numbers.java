class Result {

    /*
     * Complete the 'kaprekarNumbers' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER p
     *  2. INTEGER q
     */

    public static void kaprekarNumbers(int p, int q) {
        // Write your code here
        List<Long> kaprekar = new ArrayList<>();
        for (long i=p; i<=q; i++){
            String square = String.valueOf(i*i);
            if (square.length()==1){
                if (Integer.valueOf(square) == i){
                    kaprekar.add(i);
                }
                continue;
            }
            
            String[] halves = {square.substring(0, Math.floorDiv(square.length(),2))
                , square.substring(Math.floorDiv(square.length(),2), square.length())};
            long sum = Long.valueOf(halves[0]) + Long.valueOf(halves[1]);
            if (sum == i){
                kaprekar.add(i);
            }
            
        }
        if (kaprekar.isEmpty()){
            System.out.println("INVALID RANGE");
        }
        else{
            System.out.println(kaprekar.stream().map(Object::toString).collect(Collectors.joining(" ")));
        }
        

    }

}