class Result {

    /*
     * Complete the 'designerPdfViewer' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY h
     *  2. STRING word
     */

    public static int designerPdfViewer(List<Integer> h, String word) {
        HashMap<Character, Integer> charmap = new HashMap<Character, Integer>();
        for (int i = 0; i <= 25; i++) {
            char letter = (char) ('a' + i);
            charmap.put(letter, i);
        }
        List<Integer> charValues = new ArrayList<>();
        for (int i = 0; i<word.length(); i++){
            charValues.add(h.get(charmap.get(word.charAt(i))));
        }
        int maxValue = charValues.stream().mapToInt(v -> v).max().getAsInt();
        return maxValue*word.length();
    }

}