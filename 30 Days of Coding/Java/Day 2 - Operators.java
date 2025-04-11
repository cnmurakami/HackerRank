class Result {

    /*
     * Complete the 'solve' function below.
     *
     * The function accepts following parameters:
     *  1. DOUBLE meal_cost
     *  2. INTEGER tip_percent
     *  3. INTEGER tax_percent
     */

    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double result = meal_cost + (meal_cost*tip_percent/100) + (meal_cost*tax_percent/100);
        result = Math.round(result);
        System.out.println(String.format("%.0f", result));
    }

}