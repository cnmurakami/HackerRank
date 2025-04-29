class Result {

    /*
     * Complete the 'bigSorting' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts STRING_ARRAY unsorted as parameter.
     */

    public static List<String> bigSorting(List<String> unsorted) {
        // Write your code here
        unsorted.sort((a, b) -> {
            if (a.length() != b.length()) {
                return a.length() - b.length(); // shorter number is smaller
            }
            return a.compareTo(b); // same length: lexicographical comparison
        });
        return unsorted;
    }
}