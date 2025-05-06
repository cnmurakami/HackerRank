class Result {

    /*
     * Complete the 'minimumNumber' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. STRING password
     */

    public static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
        int minimumCount = 0;
        Pattern[] pattern = new Pattern[4];
        pattern[0] = Pattern.compile("[0-9]");
        pattern[1] = Pattern.compile("[a-z]");
        pattern[2] = Pattern.compile("[A-Z]");
        pattern[3] = Pattern.compile("[!@#$%^&*()\\-+]");
        for (int i = 0; i < 4; i++){
            Matcher matcher = pattern[i].matcher(password);
            if (matcher.results().count()==0){
                minimumCount++;
            }
        }
        if (password.length()+minimumCount < 6){
            minimumCount += 6 - password.length()-minimumCount;
        }
        return minimumCount;
    }

}