class Result {

    /*
     * Complete the 'pangrams' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String pangrams(String s) {
        // Write your code here
        HashSet<Character> query = new HashSet<>();
        HashSet<Character> reference = new HashSet<>();
        for (char c = 'a'; c <= 'z'; c++) {
            reference.add(c);
        }
        s = s.toLowerCase().replace(" ", "");
        System.out.println(s);
        for (Character c : s.toCharArray()){
            query.add(c);
        }
        if (query.equals(reference)){
            return "pangram";
        }
        return "not pangram";
    }

}