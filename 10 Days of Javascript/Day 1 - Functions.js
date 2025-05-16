/*
 * Create the function factorial here
 */

function factorial(n){
    let result = n;
    for (let i=n-1; i>1; i--){
        result*=i;
    }
    return result;
}