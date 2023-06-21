class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int index = 0;
        int count = 0;
        for (int i = 0; i<mat.length; i++) {
            int numOnes = countOnes(mat[i]);
            if (numOnes>count) {
                count = numOnes;
                index = i; 
            }
        }
        return new int[]{index,count};
        
    }

    public int countOnes(int[] arr) {
        int answer = 0;
        for (int i = 0; i<arr.length; i++) {
            if (arr[i]==1) {
                answer++;
            }
        }
        return answer;
    }
}
