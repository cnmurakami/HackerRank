class Result {

    /*
     * Complete the 'findDigits' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int findDigits(int n) {
        // Write your code here
        String digits = String.valueOf(n);
        int divisors = 0;
        for (int i = 0; i<digits.length(); i++){
            if (digits.charAt(i) == '0'){
                continue;
            }
            if (n % Integer.parseInt(String.valueOf(digits.charAt(i))) == 0){
                divisors++;
            }
            
        }
        return divisors;

    }

}