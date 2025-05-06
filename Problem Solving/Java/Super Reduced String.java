class Result {

    /*
     * Complete the 'superReducedString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String superReducedString(String s) {
        // Write your code here
        List<Character> charList = s.chars()
                                     .mapToObj(c -> (char) c)
                                     .collect(Collectors.toList());
        while (true){
            if (charList.isEmpty()){
                return "Empty String";
            }
            List<Integer> toDelete = new ArrayList<>();
            for (int i = 0; i<charList.size()-1; i++){
                if (charList.get(i) == charList.get(i+1)){
                    toDelete.add(i);
                    toDelete.add(i+1);
                    i++;
                }
            }
            if (toDelete.size()==0) {
                s = charList.stream()
                  .map(e->e.toString())
                  .reduce((acc, e) -> acc  + e)
                  .get();
                break;
            }
            else{
                System.out.println(toDelete);
                for (int i = toDelete.size()-1; i>= 0; i--){
                    int index = toDelete.get(i);
                    charList.remove(index);
                }
            }
        }
        return s;
    }

}