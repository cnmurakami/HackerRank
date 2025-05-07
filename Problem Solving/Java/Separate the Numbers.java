class Result {

    /*
     * Complete the 'separateNumbers' function below.
     *
     * The function accepts STRING s as parameter.
     */

    public static void separateNumbers(String s) {
        // Write your code here
        if (s.length()<2 || s.charAt(0) == '0'){
            System.out.println("NO");
            return;
        }
        List<Long> foundValues = new ArrayList<>();
        int decrement = -1;
        while(s.length()>0 || decrement>s.length()/2){
            decrement++;
            String subLeft = s.substring(0, s.length()/2-decrement);
            if (subLeft.length()> s.length()/2+1){
                break;
            }
            if (foundValues.size()>0){
                if (subLeft.length() < String.valueOf(foundValues.get(foundValues.size()-1)).length()){
                    break;
                }
                if (subLeft.length() > String.valueOf(foundValues.get(foundValues.size()-1)).length()+1) {
                    continue;
                }
            }
            String subRight = s.substring(subLeft.length(), subLeft.length()*2);
            String subRightAlt;
            try{
                subRightAlt = s.substring(subLeft.length(), subLeft.length()*2+1);
            } catch (Exception e){
                subRightAlt = subRight;
            }
            if (subLeft.length() == 0 || subRight.length() == 0){
                break;
            }
            if (subLeft.charAt(0) == '0' || subRight.charAt(0) == '0'){
                continue;
            }
            if (Long.valueOf(subRight) == Long.valueOf(subLeft)+1){
                foundValues.add(Long.valueOf(subLeft));
                foundValues.add(Long.valueOf(subRight));
                s = s.substring(subLeft.length()+subRight.length());
                decrement = -1;
            }
            else if (Long.valueOf(subRightAlt) == Long.valueOf(subLeft)+1){
                foundValues.add(Long.valueOf(subLeft));
                foundValues.add(Long.valueOf(subRightAlt));
                s = s.substring(subLeft.length()+subRightAlt.length());
                decrement = -1;
            }
        }
        if (foundValues.size()>0){
            if (s.length() > String.valueOf(foundValues.get(foundValues.size()-1)).length()+1){
                System.out.println("NO");
                return;
            }
            if (s.length()>0 && Long.valueOf(s) == foundValues.get(foundValues.size()-1)+1){
                foundValues.add(Long.valueOf(s));
                s = "";
            }
        }
        if (s.length()>0){
            System.out.println("NO");
            return;
        }
        for (int i=1; i<foundValues.size(); i++){
            if (foundValues.get(i)!= foundValues.get(i-1)+1){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES " + foundValues.get(0));
    }

}