class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int n = nums.length;
        if (n==1) {
            return nums;
        }
        int[] even;
        int[] odd;
        if (n%2==0) {
            even = new int[n / 2];
            odd = new int[n / 2];
        } else {
            even = new int[(n / 2) + 1];
            odd = new int[n / 2];
        }
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                even[i / 2] = nums[i];
            } else {
                odd[i / 2] = nums[i];
            }
        }
        Arrays.sort(even);
        Arrays.sort(odd);
        reverseArray(odd);
        int[] answer = new int[n];
        int j = 0;
        for (int i = 0; i<n/2; i++) {
            answer[2*i]=even[i];
            answer[2*i+1]=odd[i];
        }
        if (n%2!=0) {
            answer[n-1] = even[n/2];
        }
        return answer;
    }

    public void reverseArray(int[] array) {
    int start = 0;
    int end = array.length - 1;
    while (start < end) {
        int temp = array[start];
        array[start] = array[end];
        array[end] = temp;
        start++;
        end--;
        }
    }
}
