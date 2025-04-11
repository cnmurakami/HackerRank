public class Solution {

    // Complete the catAndMouse function below.
    static String catAndMouse(int x, int y, int z) {
        int catA = Math.abs(z-x);
        int catB = Math.abs(z-y);
        if (catA==catB){return "Mouse C";}
        else {
            if (Math.min(catA, catB) == catA){
                return "Cat A";
            }
            else {
                return "Cat B";
            }
        }
    }
}
