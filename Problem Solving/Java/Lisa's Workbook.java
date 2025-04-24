class Result {

    /*
     * Complete the 'workbook' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER k
     *  3. INTEGER_ARRAY arr
     */

    public static int workbook(int n, int k, List<Integer> arr) {
    // Write your code here
        HashMap<Integer, List<Integer>> pages = new HashMap<>();
        int special = 0;
        int page = 0;
        for (int i : arr){
            page++;
            List<Integer> tempPages = new ArrayList<>();
            int ex = 1;
            while (ex <= i){
                if (tempPages.size() == k){
                    pages.put(page, new ArrayList<>(tempPages));
                    tempPages.clear();
                    page++;
                }
                tempPages.add(ex);
                ex++;
            }
            if (!pages.containsKey(page)){
                pages.put(page, tempPages);
            }
        }
        for (int i : pages.keySet()){
            if (pages.get(i).contains(i)){
                special++;
            }
        }
        return special;
    }

}
