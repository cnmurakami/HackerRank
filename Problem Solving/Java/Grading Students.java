class Result {

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> finalGrades = new ArrayList<>();
        for (int e : grades){
            if (e < 38) {
                finalGrades.add(e);
            }
            else if (e % 5 == 0){
                finalGrades.add(e);
            }
            else{
                for (int i = 1; i < 3 ; i++){
                    if ((e+i) % 5 == 0) {
                        e = e+i;
                        break;
                    }
                }
                finalGrades.add(e);
            }
        }
        return finalGrades;
    }

}