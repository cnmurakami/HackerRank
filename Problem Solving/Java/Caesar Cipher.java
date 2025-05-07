class Result {

    /*
     * Complete the 'caesarCipher' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER k
     */

    public static String caesarCipher(String s, int k) {
        // Write your code here
        HashMap<Integer, Character> charMap = new HashMap<>();
        charMap.put(1, 'a');
        charMap.put(2, 'b');
        charMap.put(3, 'c');
        charMap.put(4, 'd');
        charMap.put(5, 'e');
        charMap.put(6, 'f');
        charMap.put(7, 'g');
        charMap.put(8, 'h');
        charMap.put(9, 'i');
        charMap.put(10, 'j');
        charMap.put(11, 'k');
        charMap.put(12, 'l');
        charMap.put(13, 'm');
        charMap.put(14, 'n');
        charMap.put(15, 'o');
        charMap.put(16, 'p');
        charMap.put(17, 'q');
        charMap.put(18, 'r');
        charMap.put(19, 's');
        charMap.put(20, 't');
        charMap.put(21, 'u');
        charMap.put(22, 'v');
        charMap.put(23, 'w');
        charMap.put(24, 'x');
        charMap.put(25, 'y');
        charMap.put(26, 'z');
        
        String encrypted = "";
        for (int i = 0; i < s.length(); i++){
            int value = 0;
            for (Integer key:charMap.keySet()){
                if (charMap.get(key) == Character.toLowerCase(s.charAt(i))){
                    value = key;
                    break;
                }
            }
            if (value == 0){
                encrypted += s.charAt(i);
                continue;
            }
            value += k;
            if (value > 26){
                value = value % 26;
                if (value == 0){
                    value = 26;
                }
            }
            if (Character.isLowerCase(s.charAt(i))){
                encrypted += charMap.get(value);
            }
            else{
                encrypted += Character.toUpperCase(charMap.get(value));
            }
        }
        return encrypted;
    }

}