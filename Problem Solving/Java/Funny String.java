class Result {

    /*
     * Complete the 'funnyString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String funnyString(String s) {
        // Write your code here
        List<Integer> ordered = new ArrayList<>();
        List<Integer> reversed = new ArrayList<>();
        for (int i = 0; i<s.length()-1; i++){
            int abs = Math.abs((int) s.charAt(i) - (int) s.charAt(i+1));
            ordered.add(abs);
            reversed.add(0, abs);
        }
        return (ordered.equals(reversed)) ? "Funny" : "Not Funny";
    }

}