class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] answer = new int[image.length][image[0].length];
        for (int row=0;row<image.length;row++)
        {
            int[] tempArray = new int[image[row].length];
            for (int i = 0; i<tempArray.length; i++) {
                if (image[row][tempArray.length-1-i]==0) {
                    tempArray[i]=1;
                } else {
                    tempArray[i]=0;
                }
            }
            answer[row]=tempArray;
        }
        return answer;
    }
}
