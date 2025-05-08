class Result {

    /*
     * Complete the 'beautifulBinaryString' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING b as parameter.
     */

    public static int beautifulBinaryString(String b) {
        // Write your code here
        int count = 0;
        for (int i=0; i< b.length()-2; i++){
            if (b.charAt(i) == '0' && b.charAt(i+1) == '1' && b.charAt(i+2) == '0'){
                count++;
                i+=2;
            }
        }
        return count;
    }

}