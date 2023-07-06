class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int answer = 0;
        StringBuilder sb;  
        int n = words.length;
        for (int i = 0; i<n; i++) {
            for (int j = i+1; j<n; j++) {
                sb = new StringBuilder(words[j]);
                if (words[i].equals(sb.reverse().toString())) {
                    answer++;
                }
            }
        }
        return answer;
        
    }
}
