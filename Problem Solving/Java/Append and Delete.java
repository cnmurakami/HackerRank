class Result {

    /*
     * Complete the 'appendAndDelete' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. STRING t
     *  3. INTEGER k
     */

    public static String appendAndDelete(String s, String t, int k) {
        int difference = Math.abs(s.length() - t.length());
        if (t.length()<s.length() && difference<k){
            return "Yes";
        }
        if (difference>k){
            return "No";
        }
        int initialIndex = -1;
        List<Character> _s = new ArrayList<>();
        List<Character> _t = new ArrayList<>();
        for (int i = 0; i<Math.min(s.length(), t.length())+difference; i++){
            if (i < s.length()){
                _s.add(s.charAt(i));
            }
            else{
                _s.add(' ');
            }
            
            if (i < t.length()){
                _t.add(t.charAt(i));
            }
            else{
                _t.add(' ');
            }
        }
        for (int i=0; i<_s.size(); i++){
            if (_s.get(i) != _t.get(i)){
                initialIndex = i;
                break;
            }
        }
        if (initialIndex == -1) {
            return "Yes";
        }
        else if (initialIndex == 0 && k >= s.length()*2){
            return "Yes";
        }
        else{
            for (int i = _t.size()-1; i >= initialIndex; i--) {
                if (_t.get(i) == ' '){
                    k -= 1;
                }
                else{
                    if (_s.get(i) == ' '){
                        k -=1;
                    }
                    else{
                        k -=2;
                    }
                }
                if (k<0){
                    return "No";
                }
            }
            if (k==0 || k%2 == 0){return "Yes";}
            else{return "No";}
        }
    }
}