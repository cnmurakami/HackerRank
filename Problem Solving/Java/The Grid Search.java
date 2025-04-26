class Result {

    /*
     * Complete the 'gridSearch' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING_ARRAY G
     *  2. STRING_ARRAY P
     */

    public static String gridSearch(List<String> G, List<String> P) {
    // Write your code here
        for (int i = 0; i <= G.size()-P.size(); i++){
            if (!G.get(i).contains(P.get(0))){
                continue;
            }
            for (int j = 0; j <= G.get(i).length() - P.get(0).length(); j++){
                if (G.get(i).charAt(j) == P.get(0).charAt(0)){
                    System.out.println("Potential found");
                    boolean tempFound = true;
                    for (int k = 0; k < P.size(); k++){
                        String test = G.get(i+k).substring(j, j + P.get(k).length());
                        System.out.println("test = " + test);
                        System.out.println("P.get= " + P.get(k));
                        if (!test.equals(P.get(k))){
                            tempFound = false;
                            System.out.println("Fail");
                            break;
                        }
                    }
                    if (tempFound) {
                        return "YES";
                    }
                }
            }
        }
        return "NO";
    }

}