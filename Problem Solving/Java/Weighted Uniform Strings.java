class Result {

    /*
     * Complete the 'weightedUniformStrings' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER_ARRAY queries
     */

    public static List<String> weightedUniformStrings(String s, List<Integer> queries) {
        // Write your code here
        List<String> result = new ArrayList<>();
        List<Integer> weights = new ArrayList<>();
        HashMap<Character, Integer> charMap = new HashMap<>();
        charMap.put('a', 1);
        charMap.put('b', 2);
        charMap.put('c', 3);
        charMap.put('d', 4);
        charMap.put('e', 5);
        charMap.put('f', 6);
        charMap.put('g', 7);
        charMap.put('h', 8);
        charMap.put('i', 9);
        charMap.put('j', 10);
        charMap.put('k', 11);
        charMap.put('l', 12);
        charMap.put('m', 13);
        charMap.put('n', 14);
        charMap.put('o', 15);
        charMap.put('p', 16);
        charMap.put('q', 17);
        charMap.put('r', 18);
        charMap.put('s', 19);
        charMap.put('t', 20);
        charMap.put('u', 21);
        charMap.put('v', 22);
        charMap.put('w', 23);
        charMap.put('x', 24);
        charMap.put('y', 25);
        charMap.put('z', 26);
        
        int tempSum = 0;
        tempSum += charMap.get(s.charAt(0));
        weights.add(tempSum);
        for (int i = 1; i<s.length(); i++){
            if (s.charAt(i) != s.charAt(i-1)){
                tempSum = 0;
            }
            tempSum += charMap.get(s.charAt(i));
            weights.add(tempSum);
        }
        Collections.sort(weights);
        for (int i:queries){
            if (weights.contains(i)){
                result.add("Yes");
            }
            else{
                result.add("No");
            }
        }
        return result;
    }

}