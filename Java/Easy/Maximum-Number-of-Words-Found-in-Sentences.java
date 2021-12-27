class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for (int i=0;i<sentences.length;i++)
        {
        String[] arrOfStr = sentences[i].split(" ");
        if (arrOfStr.length>=max)
        {
            max=arrOfStr.length;
        }
        }
        return max;
    }
}
