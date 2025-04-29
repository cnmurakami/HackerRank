class Result {

    /*
     * Complete the 'alternate' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int alternate(String s) {
    // Write your code here
        List<Character> charList = s.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        int sequence = 0;
        HashSet<String> charSet = new HashSet<>();
        for (int i = 0; charList.size()>1 && i<charList.size()-1; i++){
            for (int k = i+1; k < charList.size(); k++) {
                if (charSet.contains(charList.get(i)+""+charList.get(k)) || charSet.contains(charList.get(k)+""+charList.get(i)) || i==k){
                    continue;
                }
                charSet.add(charList.get(i)+""+charList.get(k));
                charSet.add(charList.get(k)+""+charList.get(i));
                List<Character> tempList = new ArrayList<>();
                for (int j = 0; j<charList.size();  j++){
                    if (String.valueOf(charList.get(j)).equals(String.valueOf(charList.get(i))) || String.valueOf(charList.get(j)).equals(String.valueOf(charList.get(k)))){
                        tempList.add(charList.get(j));
                        if (tempList.size()>1 && tempList.get(tempList.size()-1) == tempList.get(tempList.size()-2)){
                            tempList.clear();
                            break;
                        }
                    }
                }
                if (tempList.size() > sequence) {
                    sequence = tempList.size();
                }    
            }
        }
        return sequence;
    }

}