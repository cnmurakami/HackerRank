class Result {

    /*
     * Complete the 'dayOfProgrammer' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts INTEGER year as parameter.
     */

    public static String dayOfProgrammer(int year) {
    // Write your code here
        int month = 9;
        int day = 13;
        if (year <= 1917){ //Julian calendar
            if (year % 4 == 0){ //leap year
                day = 12;
            }
        }
        else if (year >= 1919) {//Gregorian calendar
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){ //leap year
                day = 12;
            }
        }
        else{
            day = 26;
        }
        return day+".0"+month+"."+year;
    }

}