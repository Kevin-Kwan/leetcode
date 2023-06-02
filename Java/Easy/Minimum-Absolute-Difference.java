class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> answer = new LinkedList<>();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i<arr.length-1;i++) {
            int difference = arr[i+1]-arr[i];
            if (difference < min) {
                answer = new LinkedList<>();
                min = difference;
                answer.add(Arrays.asList(arr[i],arr[i+1]));
            } else if (difference == min) {
                answer.add(Arrays.asList(arr[i],arr[i+1]));
            }
        }
        return answer;
    }
}
