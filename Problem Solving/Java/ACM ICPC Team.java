class Result {

    /*
     * Complete the 'acmTeam' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts STRING_ARRAY topic as parameter.
     */

    public static List<Integer> acmTeam(List<String> topic) {
        // Write your code here
        List<Integer> knowledge = new ArrayList<>();
        for (int i = 0; i < topic.size()-1; i++){
            for (int j = i+1; j < topic.size(); j++){
                if (i==j) {
                    continue;
                }
                int maxTopics = 0;
                for (int k = 0; k< topic.get(i).length(); k++){
                    if (topic.get(i).charAt(k) == '1' || topic.get(j).charAt(k) == '1'){
                        maxTopics ++;
                    }
                }
                knowledge.add(maxTopics);
            }
        }
        int maxValue = knowledge.stream().mapToInt(v -> v).max().getAsInt();
        int repetitions = (int) knowledge.stream().filter(v -> v==maxValue).count();
        return List.of(maxValue, repetitions);
    }

}