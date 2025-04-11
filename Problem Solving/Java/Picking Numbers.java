class Result {

    /*
     * Complete the 'pickingNumbers' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int pickingNumbers(List<Integer> a) {
        int maxLen = 0;
        for (int i = 0; i<a.size(); i++){
            int testValue = a.get(i);
            List<Integer> tempArray = new ArrayList<>();
            tempArray.add(testValue);
            for (int j = 0; j<a.size(); j++){
                if (j==i){continue;}
                if (Math.abs(testValue - a.get(j))<=1){
                    tempArray.add(a.get(j));
                }
            }
            boolean candidate=true;
            do{
                candidate = true;
                for (int j = 0; j<tempArray.size(); j++){
                    for (int k = 0; k<tempArray.size(); k++){
                        if (Math.abs(tempArray.get(j) - tempArray.get(k))>1){
                            candidate = false;
                            tempArray.remove(k);
                            break;
                        }
                    }
                    if (!candidate){break;}
                }
            }while(!candidate);
            if (tempArray.size()>maxLen){
                maxLen = tempArray.size();
            }
        }
        return maxLen;

    }

}