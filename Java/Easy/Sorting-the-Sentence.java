class Solution {
    public String sortSentence(String s) {
        String[] newArray = s.split(" ");
        String[] temp = new String[newArray.length];
        String answer = "";
        for (String word:newArray) {
            temp[word.charAt(word.length()-1)-'1']=word.substring(0,word.length()-1);
        }
        for (int i = 0; i<temp.length;i++) {
            if (i!=temp.length-1) {
                answer+=temp[i]+" ";
            } else {
                answer+=temp[i];
            }
            
        }
        return answer;
    }
}
