class Result {

    /*
     * Complete the 'marsExploration' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int marsExploration(String s) {
        // Write your code here
        int errors = 0;
        for (int i=0; i<s.length(); i+=3){
            if (s.charAt(i) != 'S'){
                errors++;
            }
            if (s.charAt(i+1) != 'O'){
                errors++;
            }
            if (s.charAt(i+2) != 'S'){
                errors++;
            }
        }
        return errors;
    }

}