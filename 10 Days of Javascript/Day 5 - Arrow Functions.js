/*
 * Modify and return the array so that all even elements are doubled and all odd elements are tripled.
 * 
 * Parameter(s):
 * nums: An array of numbers.
 */
function modifyArray(nums) {
    return nums.map(
        v => {
            if (v%2==0){
                return v*2;
            }
            else {
                return v*3;
            }
        }
    );
    
}
