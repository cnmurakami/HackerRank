class Result {

    /*
     * Complete the 'gemstones' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING_ARRAY arr as parameter.
     */

    public static int gemstones(List<String> arr) {
    // Write your code here
        HashSet<Character> gems = new HashSet<>();
        int count = 0;
        for (char c : arr.get(0).toCharArray()){
            if (!gems.contains(c)){
                gems.add(c);
                boolean isGem = true;
                for (String s: arr){
                    if (s.equals(arr.get(0))){
                        continue;
                    }
                    isGem = hasGem(s, c);
                    if (!isGem) {
                        break;
                    }
                }
                if (isGem) {
                    count++;
                }
            }
        }
        return count;
    
    }
    
    public static boolean hasGem(String s, Character c){
        for (char _c: s.toCharArray()){
            if (_c==c){
                return true;
            }
        }
        return false;
    }

}