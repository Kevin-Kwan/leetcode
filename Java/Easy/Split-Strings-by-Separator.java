class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> answer = new LinkedList<>();
        for (String word:words) {
            String[] splits = word.split("["+separator+"]");
            for (String split:splits) {
                if (split.length()>0) {
                    answer.add(split);
                }
            }
        }
        return answer;
    }
}
