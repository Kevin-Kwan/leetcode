class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int amountToRemove = (int)(n*0.05);
        return calculateSum(arr,amountToRemove,n-amountToRemove);
    }

    public double calculateSum(int[] arr, int startIndex, int endIndex) {
        int sum = 0;
        int count = endIndex-startIndex;
        for (int i = startIndex; i<endIndex; i++) {
            sum+=arr[i];
        }
        return (double)sum/count;
    }
}
